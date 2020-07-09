package com.rveing.service.impl;


import com.rveing.mapper.HotelRoomMapper;
import com.rveing.pojo.Hotel;
import com.rveing.pojo.HotelRoom;
import com.rveing.pojo.HotelRoomExample;
import com.rveing.pojo.HotelRoomImage;
import com.rveing.service.HotelRoomImageService;
import com.rveing.service.HotelRoomService;
import com.rveing.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelRoomServiceImpl implements HotelRoomService {
    @Autowired
    HotelRoomMapper hotelRoomMapper;
    @Autowired
    HotelService hotelService;
    @Autowired
    HotelRoomImageService hotelRoomImageService;

    @Override
    public void add(HotelRoom r) {
        hotelRoomMapper.insert(r);
    }

    @Override
    public void delete(int id) {
        hotelRoomMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(HotelRoom r) {
        hotelRoomMapper.updateByPrimaryKeySelective(r);
    }

    @Override
    public HotelRoom get(int id) {
        HotelRoom r = hotelRoomMapper.selectByPrimaryKey(id);
        setHotel(r);
        return r;
    }

    public void setHotel(List<HotelRoom> rs){
        for (HotelRoom r : rs)
            setHotel(r);
    }
    public void setHotel(HotelRoom r){
        int hid = r.getHid();
        Hotel h = hotelService.get(hid);
        r.setHotel(h);
    }

    @Override
    public List list(int hid) {
        HotelRoomExample example = new HotelRoomExample();
        example.createCriteria().andHidEqualTo(hid);
        example.setOrderByClause("id desc");
        List result = hotelRoomMapper.selectByExample(example);
        setHotel(result);
  //      setFirstHotelRoomImage(result);
        return result;
    }

    @Override
    public void setFirstHotelRoomImage(HotelRoom r) {
        List<HotelRoomImage> his = hotelRoomImageService.list(r.getId());
        if (!his.isEmpty()) {
            HotelRoomImage hi = his.get(0);
            r.setFirstHotelRoomImage(hi);
        }
    }

    public void setFirstHotelRoomImage(List<HotelRoom> rs) {
        for (HotelRoom r : rs) {
            setFirstHotelRoomImage(r);
        }
    }
}
