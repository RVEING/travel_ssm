package com.rveing.service;

import com.rveing.pojo.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> list();
    void add(Hotel hotel);
    void delete(int id);
    Hotel get(int id);
    void update(Hotel hotel);
    List<Hotel> navList();

    void setFirstHotelImage(Hotel h);

    void setSaleAndReviewNumber(Hotel h);
    void setSaleAndReviewNumber(List<Hotel> hs);

    List<Hotel> search(String keyword);
}
