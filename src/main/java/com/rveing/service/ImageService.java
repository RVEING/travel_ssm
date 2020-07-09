package com.rveing.service;

import com.rveing.pojo.Image;

import java.util.List;

public interface ImageService {

    void add(Image i);
    void delete(int id);
    void update(Image i);
    Image get(int id);
    List list(int sid);
}
