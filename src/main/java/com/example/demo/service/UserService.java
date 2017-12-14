package com.example.demo.service;

import com.example.demo.mapper.TCommAreaMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.TCommArea;
import com.example.demo.model.TCommAreaExample;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TCommAreaMapper commAreaMapper;

    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    public List<TCommArea> selectByExample(TCommAreaExample example) {
        return commAreaMapper.selectByExample(example);
    }

    public TCommArea selectByPrimaryKey(Long aLong) {
        return commAreaMapper.selectByPrimaryKey(aLong);
    }

    public void updateByPrimaryKey(TCommArea tCommArea) {
        commAreaMapper.updateByPrimaryKey(tCommArea);
    }
}
