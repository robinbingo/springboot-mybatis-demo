package com.example.demo.mapper;

import com.example.demo.model.ColumnInfo;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    User findUserById(Integer id);

    List<ColumnInfo> getColumnInfoList();
}