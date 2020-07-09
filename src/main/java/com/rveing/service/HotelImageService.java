package com.rveing.service;

import com.rveing.pojo.HotelImage;

import java.util.List;

public interface HotelImageService {
    void add(HotelImage i);
    void delete(int id);
    void update(HotelImage i);
    HotelImage get(int id);
    List list(int hid);
}
