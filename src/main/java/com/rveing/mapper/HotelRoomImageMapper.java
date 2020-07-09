package com.rveing.mapper;

import com.rveing.pojo.HotelRoomImage;
import com.rveing.pojo.HotelRoomImageExample;
import java.util.List;

public interface HotelRoomImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelRoomImage record);

    int insertSelective(HotelRoomImage record);

    List<HotelRoomImage> selectByExample(HotelRoomImageExample example);

    HotelRoomImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelRoomImage record);

    int updateByPrimaryKey(HotelRoomImage record);
}