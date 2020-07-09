package com.rveing.service;

import com.rveing.pojo.Like;

import java.util.List;

public interface Likeservice {
    List<Like> findLikesByUser(int uid);
}
