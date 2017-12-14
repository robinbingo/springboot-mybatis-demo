package com.example.demo.mapper;

import com.example.demo.model.TCommArea;
import com.example.demo.model.TCommAreaExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TCommAreaMapper {
    long countByExample(TCommAreaExample example);

    int deleteByExample(TCommAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCommArea record);

    int insertSelective(TCommArea record);

    List<TCommArea> selectByExample(TCommAreaExample example);

    TCommArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCommArea record, @Param("example") TCommAreaExample example);

    int updateByExample(@Param("record") TCommArea record, @Param("example") TCommAreaExample example);

    int updateByPrimaryKeySelective(TCommArea record);

    int updateByPrimaryKey(TCommArea record);
}