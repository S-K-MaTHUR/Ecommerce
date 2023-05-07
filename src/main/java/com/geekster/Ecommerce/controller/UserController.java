package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.model.UserModel;
import com.geekster.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping()
    public String addUsers(@RequestBody List<UserModel> users){
        return userService.addUsers(users);
    }
    @GetMapping()
    public UserModel getUser(@RequestParam Integer userId) {
        return userService.getUser(userId);
    }
}
