package com.rveing.mapper;

import com.rveing.pojo.Hotel;
import com.rveing.pojo.HotelExample;
import java.util.List;

public interface HotelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    List<Hotel> selectByExample(HotelExample example);

    Hotel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);
}