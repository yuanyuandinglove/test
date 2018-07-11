package com.test.service.impl;

import com.test.mapper.UserConfigMapper;
import com.test.mybaitsenity.User;
import com.test.redis.service.RedisServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBaitsXMLUserServiceImpl {
    @Autowired
    public UserConfigMapper userConfigMapper;

    @Autowired
    private RedisServiceImp redisServiceImp;

    public User findById(Long id) {

      return  userConfigMapper.findbyId(id);
    }


    public List<User> findAll() {
       return userConfigMapper.findAll();
    }

    public int addUser(User user){
        userConfigMapper.insert(user);
        return  0 ;
    };
}
