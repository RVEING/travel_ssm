package com.rveing.service.impl;

import com.rveing.mapper.ImageMapper;
import com.rveing.pojo.Image;
import com.rveing.pojo.ImageExample;
import com.rveing.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    ImageMapper imageMapper;
    @Override
    public void add(Image i) {
        imageMapper.insert(i);
    }

    @Override
    public void delete(int id) {
        imageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Image i) {
        imageMapper.updateByPrimaryKeySelective(i);
    }

    @Override
    public Image get(int id) {
        return imageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list(int sid) {
        ImageExample example =new ImageExample();
        example.createCriteria().andScenic_spot_idEqualTo(sid);
        example.setOrderByClause("id asc");
        return imageMapper.selectByExample(example);
    }
}
