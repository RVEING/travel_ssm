package com.rveing.service;

import com.rveing.pojo.Scenic_spot;

import java.util.List;

public interface ScenicSpotService {
    List<Scenic_spot> list();
    void add(Scenic_spot spot);
    void delete(int id);
    Scenic_spot get(int id);
    void update(Scenic_spot spot);

    void setFirstScenicSpotImage(Scenic_spot s);

    void setSaleAndReviewNumber(Scenic_spot s);
    void setSaleAndReviewNumber(List<Scenic_spot> ss);

    List<Scenic_spot> search(String keyword);

    Scenic_spot findSpotById(int sid);
    List<Scenic_spot> findTopNSpots(List<Scenic_spot> spots);
    List<Scenic_spot> findTopNSpots1(List<Scenic_spot> spots);
}
