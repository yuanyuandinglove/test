package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.mybaitsenity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBaitsUserServiceImpl  {
    @Autowired
    public UserMapper userMapper;

    public User findById(Long id) {
      return  userMapper.findbyId(id);
    }

    public List<User> findAll() {
       return userMapper.findAll();
    }
}
