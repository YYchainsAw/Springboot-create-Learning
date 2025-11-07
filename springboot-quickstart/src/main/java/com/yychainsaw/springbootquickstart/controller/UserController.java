package com.yychainsaw.springbootquickstart.controller;

import com.yychainsaw.springbootquickstart.pojo.User;
import com.yychainsaw.springbootquickstart.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    public User getUserById(Integer id) {
        return userService.getUserById(id);
    }
}
