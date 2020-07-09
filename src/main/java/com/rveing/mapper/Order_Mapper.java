package com.rveing.mapper;

import com.rveing.pojo.Order_;
import com.rveing.pojo.Order_Example;
import java.util.List;

public interface Order_Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order_ record);

    int insertSelective(Order_ record);

    List<Order_> selectByExample(Order_Example example);

    Order_ selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_ record);

    int updateByPrimaryKey(Order_ record);
}