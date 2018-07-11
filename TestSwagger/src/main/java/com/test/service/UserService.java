package com.test.service;


import com.test.jpaenity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();
}
