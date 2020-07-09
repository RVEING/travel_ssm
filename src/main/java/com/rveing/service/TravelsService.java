package com.rveing.service;

import com.rveing.pojo.Travels;
import com.rveing.pojo.TravelsWithBLOBs;

import java.util.List;

public interface TravelsService {
    //根据id得到某个游记的具体信息
    public Travels getTravelsVo(int Travels_id);

    //显示所有的游记
    public List<Travels> getAllTravels();

    //将游记信息保存进数据库中
    public void saveTravel(Travels travel);

    //根据游记的标题模糊查询游记
    //List<Travels> getTravelsByName(Search search);

    //给游记点赞
    //public void addGood(GiveGood giveGood);
    //根据用户id查询该用户所有发布过的游记
    public List<Travels> getUserAllTravels(int userid);
    //编辑修改用户游记
    public void editTravel(Travels travelsVo);
    //删除游记
    public void deleteTravel(int travelid);
}
