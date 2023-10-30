package com.dl.book_security.controller;

import com.dl.book_security.pojo.User;
import com.dl.book_security.face.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //用户注册
    @PostMapping("/registered")
    public void registered(@RequestBody User user){
        userService.createUser(user);
    }

    //获取用户信息
    @GetMapping("/user/{id}")
    public void getUserInfo(@PathVariable("id") Long id){
        userService.getUser(id);
    }


}
