package com.rveing.service.impl;

import com.rveing.mapper.HotelMapper;
import com.rveing.mapper.HotelRoomMapper;
import com.rveing.pojo.Hotel;
import com.rveing.pojo.HotelExample;
import com.rveing.pojo.HotelImage;
import com.rveing.pojo.HotelRoom;
import com.rveing.service.HotelImageService;
import com.rveing.service.HotelRoomService;
import com.rveing.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelMapper hotelMapper;
    @Autowired
    HotelRoomService hotelRoomService;
    @Autowired
    HotelImageService hotelImageService;

    @Override
    public List<Hotel> list() {
        HotelExample example=new HotelExample();
        example.setOrderByClause("id asc");
        List result=hotelMapper.selectByExample(example);
        setFirstHotelImage(result);
        return result;
    }

    @Override
    public void add(Hotel hotel) {
        hotelMapper.insert(hotel);
    }

    @Override
    public void delete(int id) {
        hotelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Hotel get(int id) {
        return hotelMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Hotel hotel) {
        hotelMapper.updateByPrimaryKeySelective(hotel);
    }

    @Override
    public void setFirstHotelImage(Hotel h) {
        List<HotelImage> his = hotelImageService.list(h.getId());
        if (!his.isEmpty()) {
            HotelImage hi = his.get(0);
            h.setFirstHotelImage(hi);
        }
    }

    public void setFirstHotelImage(List<Hotel> hs) {
        for (Hotel h : hs) {
            setFirstHotelImage(h);
        }
    }

    @Override
    public void setSaleAndReviewNumber(Hotel h) {

    }

    @Override
    public void setSaleAndReviewNumber(List<Hotel> hs) {

    }

    @Override
    public List<Hotel> search(String keyword) {
        HotelExample example = new HotelExample();
        example.createCriteria().andHnameLike("%" + keyword + "%");
        example.setOrderByClause("id desc");
        List<Hotel> result = hotelMapper.selectByExample(example);
        float minPrice=9999999;
        for(Hotel h:result){
            List<HotelRoom> resultRoom=hotelRoomService.list(h.getId());
            for(int i=0;i<resultRoom.size();i++){
                if(resultRoom.get(i).getPrice()<minPrice)
                    minPrice=resultRoom.get(i).getPrice();

            }
            h.setMinPrice(minPrice);
        }

        return result;
    }
    public List<Hotel> navList() {
        HotelExample example=new HotelExample();
        example.setOrderByClause("id asc");
        List<Hotel> result=hotelMapper.selectByExample(example);
        setFirstHotelImage(result);
        float minPrice=9999999;
        for(Hotel h:result){
            List<HotelRoom> resultRoom=hotelRoomService.list(h.getId());
            for(int i=0;i<resultRoom.size();i++){
                if(resultRoom.get(i).getPrice()<minPrice)
                    minPrice=resultRoom.get(i).getPrice();

            }
            h.setMinPrice(minPrice);
        }
        return result;
    }
}
