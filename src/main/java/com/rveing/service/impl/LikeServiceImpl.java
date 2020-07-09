package com.rveing.service.impl;

import com.rveing.mapper.LikeMapper;
import com.rveing.pojo.Like;
import com.rveing.pojo.LikeExample;
import com.rveing.service.Likeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LikeServiceImpl implements Likeservice {
    @Autowired
    LikeMapper likeMapper;
    @Override
    public List<Like> findLikesByUser(int uid) {
        LikeExample example=new LikeExample();
        example.createCriteria().andUidEqualTo(uid);
        List<Like> result= likeMapper.selectByExample(example);
        return result;
    }
}
