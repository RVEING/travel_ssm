package com.rveing.mapper;

import com.rveing.pojo.Travels;
import com.rveing.pojo.TravelsExample;
import java.util.List;

public interface TravelsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Travels record);

    int insertSelective(Travels record);

    List<Travels> selectByExample(TravelsExample example);

    Travels selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Travels record);

    int updateByPrimaryKey(Travels record);
}