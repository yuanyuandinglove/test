package com.test.control;

import com.test.dao.NationalDao;
import com.test.jpaenity.National;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/national")
public class NationalControl {

    @Autowired
    public NationalDao nationalDao;

    @RequestMapping(value = "/getNationalbyId/{id}")
    public National getUserbyId(@PathVariable Long id) {

        return nationalDao.findByMyId(id);
    }

    @RequestMapping("/getUserAll")
    public List<National> getUserAll() {
        return nationalDao.findAll();
    }
}

