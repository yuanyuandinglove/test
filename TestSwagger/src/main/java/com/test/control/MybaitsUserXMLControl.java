package com.test.control;

import com.test.mybaitsenity.User;
import com.test.redis.utils.JSONUtil;
import com.test.service.impl.MyBaitsXMLUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybaitsXML")
public class MybaitsUserXMLControl {

    @Autowired
   private MyBaitsXMLUserServiceImpl myBaitsXMLUserService;
    @Autowired
    private Environment environment;

    @RequestMapping(value = "/getUserbyId/{id}")
    @Cacheable(value = "id")
    public String getUserbyId(@PathVariable Long id) {
        System.out.println("没有缓存到");
        System.out.println(environment.getRequiredProperty("info.app.name"));
        User user =  myBaitsXMLUserService.findById(id);
        return JSONUtil.toJson(user);
    }
    @RequestMapping(value = "/getUserbyIdOne/{id}")
    @Cacheable(value = "test",key = " '_' +#id")
    public String getUserbyIdOne(@PathVariable Long id) {
        System.out.println("没有缓存到");
        User user =  myBaitsXMLUserService.findById(id);
        return JSONUtil.toJson(user);
    }

    @RequestMapping(value = "/getAll")
    public List<User> getUserAll() {
        return myBaitsXMLUserService.findAll();
    }

    @RequestMapping(value = "/getInsert/{name}/{address}")
    public void getUserInsert(@PathVariable String name,@PathVariable String address) {
        User user  = new User();
     //   user.setId(id);
        user.setName(name);
        user.setAddress(address);
        myBaitsXMLUserService.addUser(user);

    }
}
