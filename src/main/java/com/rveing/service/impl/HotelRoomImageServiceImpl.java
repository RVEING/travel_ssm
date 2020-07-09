package com.rveing.service.impl;

import com.rveing.mapper.HotelRoomImageMapper;
import com.rveing.pojo.HotelRoomImage;
import com.rveing.pojo.HotelRoomImageExample;
import com.rveing.service.HotelRoomImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRoomImageServiceImpl implements HotelRoomImageService {
    @Autowired
    HotelRoomImageMapper hotelRoomImageMapper;
    @Override
    public void add(HotelRoomImage i) {
        hotelRoomImageMapper.insert(i);
    }

    @Override
    public void delete(int id) {
        hotelRoomImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(HotelRoomImage i) {
        hotelRoomImageMapper.updateByPrimaryKeySelective(i);
    }

    @Override
    public HotelRoomImage get(int id) {
        return hotelRoomImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list(int rid) {
        HotelRoomImageExample example =new HotelRoomImageExample();
        example.createCriteria().andHotelRoom_idEqualTo(rid);
        example.setOrderByClause("id asc");
        return hotelRoomImageMapper.selectByExample(example);
    }
}
