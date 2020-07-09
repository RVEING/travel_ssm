package com.rveing.util;

import com.rveing.pojo.Like;
import com.rveing.pojo.Scenic_spot;
import com.rveing.pojo.User;
import com.rveing.service.Likeservice;
import com.rveing.service.ScenicSpotService;
import com.rveing.service.UserService;
import com.rveing.service.impl.LikeServiceImpl;
import com.rveing.service.impl.ScenicSpotServiceImpl;
import com.rveing.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ItemSimilarity {
    //通过计算余弦相似度并取TopN, 返回为uid的用户生成的5个推荐景点
    public static List<Scenic_spot> recommend(int uid){
        UserService userService = new UserServiceImpl();
        ScenicSpotService spotService = new ScenicSpotServiceImpl();
        Likeservice likeService = new LikeServiceImpl();

        List<Like> likeLists;                                       //其他用户喜欢的景点列表

        List<User> users = userService.list();                   //所有用户列表
        List<Scenic_spot> spots = spotService.list();               //所有景点列表
        int[][] curMatrix = new int[spots.size()+5][spots.size()+5];   //当前矩阵
        int[][] comMatrix = new int[spots.size()+5][spots.size()+5];   //共现矩阵
        int[] N = new int[spots.size()+5];                              //喜欢每个物品的人数

        for(User user: users){
            if(user.getId()==uid) continue;                    //当前用户则跳过

            likeLists = likeService.findLikesByUser(user.getId()); //当前用户的喜欢列表

            for(int i = 0; i < spots.size(); i++)
                for(int j = 0; j < spots.size(); j++)
                    curMatrix[i][j] = 0;                               //清空矩阵

            for(int i = 0; i < likeLists.size(); i++){
                int pid1 = likeLists.get(i).getSid();        	//获得景点id
                ++N[pid1];
                for(int j = i+1; j < likeLists.size(); j++){
                    int pid2 = likeLists.get(j).getSid();
                    ++curMatrix[pid1][pid2];
                    ++curMatrix[pid2][pid1]; 			//两两加一
                }
            }
            //累加所有矩阵, 得到共现矩阵
            for(int i = 0; i < spots.size(); i++){
                for(int j = 0; j < spots.size(); j++){
                    int pid1 = spots.get(i).getId(), pid2 = spots.get(j).getId();
                    comMatrix[pid1][pid2] += curMatrix[pid1][pid2];
                    comMatrix[pid1][pid2] += curMatrix[pid1][pid2];
                }
            }
        }


        TreeSet<Scenic_spot> preList = new TreeSet<Scenic_spot>(new Comparator<Scenic_spot>() {
            @Override
            public int compare(Scenic_spot o1, Scenic_spot o2) {
                if(o1.getW()!=o2.getW())
                    return (int) (o1.getW()-o2.getW())*100;
                else
                    return o1.getCnt()-o2.getCnt();
            }
        }); //预处理的列表

        likeLists = likeService.findLikesByUser(uid);       //当前用户喜欢的景点列表
        boolean[] used = new boolean[spots.size()+5];  //判重数组
        for(Like like: likeLists){
            int Nij = 0;                         //既喜欢i又喜欢j的人数
            double Wij;                          //相似度
            Scenic_spot tmp;                           //当前的景点

            int i = like.getSid();
            for(Scenic_spot spot: spots){
                if(like.getSid() == spot.getId()) continue;
                int j = spot.getId();

                Nij = comMatrix[i][j];
                Wij = (double)Nij/Math.sqrt(N[i]*N[j]); //计算余弦相似度

                tmp = spotService.findSpotById(spot.getId());
                tmp.setW(Wij);

                if(used[tmp.getId()]) continue;
                preList.add(tmp);
                used[tmp.getId()] = true;
            }
        }

        List<Scenic_spot> recomLists = new ArrayList<>();      //生成的推荐结果
        for(int i = 0; preList.size()>0 && i<5; i++){
            recomLists.add(preList.pollLast());
            preList.pollLast();
        }
        if(recomLists.size()<5){
            //推荐数量不满5个, 补足喜欢数最高的文章
            recomLists = spotService.findTopNSpots(recomLists);
        }

        return recomLists;
    }
}
