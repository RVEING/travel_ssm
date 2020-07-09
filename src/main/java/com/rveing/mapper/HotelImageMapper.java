package com.rveing.mapper;

import com.rveing.pojo.HotelImage;
import com.rveing.pojo.HotelImageExample;
import java.util.List;

public interface HotelImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelImage record);

    int insertSelective(HotelImage record);

    List<HotelImage> selectByExample(HotelImageExample example);

    HotelImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelImage record);

    int updateByPrimaryKey(HotelImage record);
}