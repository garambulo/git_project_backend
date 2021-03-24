package com.example.demo.service;

import com.example.demo.Entities.User;
import com.example.demo.util.GithubAPIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitUserService {
    private GithubAPIUtil githubAPIUtil;

    @Autowired
    public GitUserService(){
        githubAPIUtil = new GithubAPIUtil();
    }

    public User getUserInfo(String userName){
        RestTemplate restTemplate = new RestTemplate();
        String getUserInfoURI = githubAPIUtil.getUserInfo(userName);
        User userInfo = restTemplate.getForObject(getUserInfoURI, User.class);
        return userInfo;
    }
}
