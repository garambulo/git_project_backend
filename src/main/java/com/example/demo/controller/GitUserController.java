package com.example.demo.controller;

import com.example.demo.Entities.User;
import com.example.demo.service.GitUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitUserController {
    @Autowired
    GitUserService gitUserService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/user/{userName}")
    public User getUserInfo(@PathVariable("userName") String userName){
        return gitUserService.getUserInfo(userName);
    }
}
