package com.rveing.mapper;

import com.rveing.pojo.LineImage;
import com.rveing.pojo.LineImageExample;
import java.util.List;

public interface LineImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LineImage record);

    int insertSelective(LineImage record);

    List<LineImage> selectByExample(LineImageExample example);

    LineImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LineImage record);

    int updateByPrimaryKey(LineImage record);
}