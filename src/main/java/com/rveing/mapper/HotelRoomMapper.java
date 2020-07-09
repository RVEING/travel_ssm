package com.rveing.mapper;

import com.rveing.pojo.HotelRoom;
import com.rveing.pojo.HotelRoomExample;
import java.util.List;

public interface HotelRoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelRoom record);

    int insertSelective(HotelRoom record);

    List<HotelRoom> selectByExample(HotelRoomExample example);

    HotelRoom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelRoom record);

    int updateByPrimaryKey(HotelRoom record);
}