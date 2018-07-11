package com.test.control;


import com.test.jpaenity.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserContorl {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setName("ding ");
        user.setAddress("666");
        return user;
    }

    @RequestMapping("/getUserOne")
    public String getUserOne() {
        return "ding + 666";
    }

    @RequestMapping(value = "/getUserbyId/{id}")

    public User getUserbyId(@PathVariable Long id) {

        return userService.findById(id);
    }

    @RequestMapping("/getUserAll")
    public List<User> getUserAll() {
        return userService.findAll();
    }
}
