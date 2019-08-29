package com.woniuxy.mapper;

import com.woniuxy.pojo.UserinforoleExample;
import com.woniuxy.pojo.UserinforoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinforoleMapper {
    int countByExample(UserinforoleExample example);

    int deleteByExample(UserinforoleExample example);

    int deleteByPrimaryKey(UserinforoleKey key);

    int insert(UserinforoleKey record);

    int insertSelective(UserinforoleKey record);

    List<UserinforoleKey> selectByExample(UserinforoleExample example);

    int updateByExampleSelective(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);

    int updateByExample(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);
}