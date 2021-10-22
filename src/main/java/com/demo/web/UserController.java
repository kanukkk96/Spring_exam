package com.demo.web;

import com.demo.bean.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    //@Autowired
    private UserService userService;


    @GetMapping(value = "userInfo.do")
    public String  getUserList(HttpServletRequest req, HttpServletResponse res){
        try {
            User users = userService.getUserList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "TEST";
    }



}