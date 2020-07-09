package com.rveing.mapper;

import com.rveing.pojo.Like;
import com.rveing.pojo.LikeExample;
import java.util.List;

public interface LikeMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Like record);

    int insertSelective(Like record);

    List<Like> selectByExample(LikeExample example);

    Like selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);
}