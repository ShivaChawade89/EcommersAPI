package com.shiv.EcommersAPI.controller;

import com.shiv.EcommersAPI.model.User;
import com.shiv.EcommersAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/")
    public User addAddress(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
       return userService.getUserById(id);
    }
}
