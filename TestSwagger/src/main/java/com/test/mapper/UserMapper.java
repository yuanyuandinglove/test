package com.test.mapper;

import com.test.mybaitsenity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMapper {
    @Select("select * from user where  id = #{id}")
    User findbyId(Long id);

    @Select("select * from user")
    List<User> findAll();
}
