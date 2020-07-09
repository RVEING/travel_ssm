package com.rveing.service;

import com.rveing.pojo.HotelRoomImage;

import java.util.List;

public interface HotelRoomImageService {
    void add(HotelRoomImage i);
    void delete(int id);
    void update(HotelRoomImage i);
    HotelRoomImage get(int id);
    List list(int hid);
}
