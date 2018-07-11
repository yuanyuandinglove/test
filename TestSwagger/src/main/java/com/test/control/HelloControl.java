package com.test.control;


import com.test.jpaenity.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/templates")
public class HelloControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "four";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hellotwo(Model model) {
        model.addAttribute("name", "Dear");
        return "/two";
    }
    @RequestMapping(value = "/hello2/{id}", method = RequestMethod.GET)
    public String hellotwo1(Model model,@PathVariable Long id) {
       User user = userService.findById(id);
        model.addAttribute("name", user.getName());
        return "/two";
    }

    @RequestMapping(value = "/hellothree", method = RequestMethod.GET)
    public String three() {
        return "three";
    }

    @GetMapping(value = "four")
    public String four() {
        return "four";
    }
}
