package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUserById")
    public User findUserById(@RequestParam(value = "id") Integer id) {
        User user = null;
        try {
            user = userService.findUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}