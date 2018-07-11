package com.test.mapper;

import com.test.mybaitsenity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserConfigMapper {

    User findbyId(Long id);
    List<User> findAll();
    int deleteByPrimaryKey( Long Id);

    int insert(User record);
    int insertSelective(User record);
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
