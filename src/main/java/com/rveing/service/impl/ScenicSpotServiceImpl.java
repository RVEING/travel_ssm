package com.rveing.service.impl;

import com.rveing.mapper.Scenic_spotMapper;
import com.rveing.pojo.Image;
import com.rveing.pojo.Scenic_spot;
import com.rveing.pojo.Scenic_spotExample;
import com.rveing.service.ImageService;
import com.rveing.service.ScenicSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicSpotServiceImpl implements ScenicSpotService {
    @Autowired
    Scenic_spotMapper scenice_spotMapper;

    @Autowired
    ImageService imageService;

    @Override
    public List<Scenic_spot> list() {
        Scenic_spotExample example=new Scenic_spotExample();
        example.setOrderByClause("id asc");
        List result=scenice_spotMapper.selectByExample(example);
        setFirstScenicSpotImage(result);
        return result;
    }

    @Override
    public void add(Scenic_spot spot) {
        scenice_spotMapper.insert(spot);
    }

    @Override
    public void delete(int id) {
        scenice_spotMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Scenic_spot get(int id) {
        return scenice_spotMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Scenic_spot spot) {
        scenice_spotMapper.updateByPrimaryKeySelective(spot);
    }

    @Override
    public void setFirstScenicSpotImage(Scenic_spot s) {
        List<Image> sis = imageService.list(s.getId());
        if (!sis.isEmpty()) {
            Image si = sis.get(0);
            s.setFirstScenicSpotImage(si);
        }
    }

    public void setFirstScenicSpotImage(List<Scenic_spot> ss) {
        for (Scenic_spot s : ss) {
            setFirstScenicSpotImage(s);
        }
    }

    @Override
    public void setSaleAndReviewNumber(Scenic_spot s) {

    }

    @Override
    public void setSaleAndReviewNumber(List<Scenic_spot> ss) {

    }

    @Override
    public List<Scenic_spot> search(String keyword) {
        Scenic_spotExample example = new Scenic_spotExample();
        example.createCriteria().andSnameLike("%" + keyword + "%");
        example.setOrderByClause("id desc");
        List result = scenice_spotMapper.selectByExample(example);

        return result;
    }

    @Override
    public Scenic_spot findSpotById(int sid) {
        Scenic_spot spot=scenice_spotMapper.selectByPrimaryKey(sid);
        return spot;
    }

    @Override
    public List<Scenic_spot> findTopNSpots(List<Scenic_spot> spots) {
        Scenic_spotExample example=new Scenic_spotExample();
       // example.createCriteria().andCntEqualTo();
        example.setOrderByClause("cnt desc");
        List<Scenic_spot> scenicSpots=scenice_spotMapper.selectByExample(example);


        int i=0;
        while(spots.size()<5){

            for(Scenic_spot s:scenicSpots){
                i++;
                spots.add(s);
                if(i>=5)
                    break;
            }
        }
        for(Scenic_spot s:spots){
            System.out.println("测试2"+s.getSname());
        }
        return spots;
    }
    @Override
    public List<Scenic_spot> findTopNSpots1(List<Scenic_spot> spots) {
        Scenic_spotExample example=new Scenic_spotExample();
        // example.createCriteria().andCntEqualTo();
        example.setOrderByClause("id desc");
        List<Scenic_spot> scenicSpots=scenice_spotMapper.selectByExample(example);

        int i=0;
        while(spots.size()<5){

            for(Scenic_spot s:scenicSpots){
                i++;
                spots.add(s);
                if(i>=5)
                    break;
            }
        }

        return spots;
    }


}
