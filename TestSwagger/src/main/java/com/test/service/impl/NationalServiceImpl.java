package com.test.service.impl;
import com.test.dao.NationalDao;
import com.test.dao.UserDao;
import com.test.jpaenity.National;
import com.test.jpaenity.User;
import com.test.service.UserService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalServiceImpl  {
    @Autowired
    private NationalDao nationalDao;

    public National findById( Long id) {
        return nationalDao.findByMyId(id);
    }
    public List<National> findAll() {
        return nationalDao.findAll();
    }
}
