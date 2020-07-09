package com.rveing.service;

import com.rveing.pojo.HotelRoom;

import java.util.List;

public interface HotelRoomService {
    void add(HotelRoom r);
    void delete(int id);
    void update(HotelRoom r);
    HotelRoom get(int id);
    List list(int hid);
    //float searchMinPrice()

    void setFirstHotelRoomImage(HotelRoom r);
}
