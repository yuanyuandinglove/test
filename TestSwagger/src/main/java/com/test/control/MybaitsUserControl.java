package com.test.control;

import com.test.mybaitsenity.User;
import com.test.service.impl.MyBaitsUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybaits")
public class MybaitsUserControl {

    @Autowired
   private MyBaitsUserServiceImpl myBaitsUserService;
    @RequestMapping(value = "/getUserbyId/{id}")
    public User getUserbyId(@PathVariable Long id) {
        return myBaitsUserService.findById(id);
    }

    @RequestMapping(value = "/getAll")
    public List<User> getUserAll() {
        return myBaitsUserService.findAll();
    }
}
