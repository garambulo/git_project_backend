package com.example.demo.service;

import com.example.demo.Entities.Search;
import com.example.demo.util.GithubAPIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitSearchService {
    private GithubAPIUtil githubAPIUtil;

    @Autowired
    public GitSearchService(){
        githubAPIUtil = new GithubAPIUtil();
    }

    public Search getSearchedItem(String repositoryName){
        RestTemplate restTemplate = new RestTemplate();
        String searchURI = githubAPIUtil.getSearchURL(repositoryName);
        Search searchedItem = restTemplate.getForObject(searchURI, Search.class);
        return searchedItem;
    }
}
