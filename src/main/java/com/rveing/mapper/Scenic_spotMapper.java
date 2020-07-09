package com.rveing.mapper;

import com.rveing.pojo.Scenic_spot;
import com.rveing.pojo.Scenic_spotExample;
import java.util.List;

public interface Scenic_spotMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Scenic_spot record);

    int insertSelective(Scenic_spot record);

    List<Scenic_spot> selectByExample(Scenic_spotExample example);

    Scenic_spot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Scenic_spot record);

    int updateByPrimaryKey(Scenic_spot record);
}