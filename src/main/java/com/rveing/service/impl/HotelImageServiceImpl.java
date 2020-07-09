package com.rveing.service.impl;

import com.rveing.mapper.HotelImageMapper;
import com.rveing.pojo.HotelImage;
import com.rveing.pojo.HotelImageExample;
import com.rveing.service.HotelImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelImageServiceImpl implements HotelImageService {
    @Autowired
    HotelImageMapper hotelImageMapper;

    @Override
    public void add(HotelImage i) {
        hotelImageMapper.insert(i);
    }

    @Override
    public void delete(int id) {
        hotelImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(HotelImage i) {
        hotelImageMapper.updateByPrimaryKeySelective(i);
    }

    @Override
    public HotelImage get(int id) {
        return hotelImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list(int hid) {
        HotelImageExample example =new HotelImageExample();
        example.createCriteria().andHotel_idEqualTo(hid);
        example.setOrderByClause("id asc");
        return hotelImageMapper.selectByExample(example);
    }
}
