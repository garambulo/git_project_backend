package com.example.demo.service;

import com.example.demo.Entities.Contributor;
import com.example.demo.util.GithubAPIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GitContributorService {
    private GithubAPIUtil githubAPIUtil;

    @Autowired
    public GitContributorService(){
        githubAPIUtil = new GithubAPIUtil();
    }
    public List<Contributor> getContributorList(String author, String repositoryName){
        RestTemplate restTemplate = new RestTemplate();
        String getContributorsURI = githubAPIUtil.getOneHundredContributors(author, repositoryName);
        List<Contributor> contributorList = restTemplate.getForObject(getContributorsURI, List.class);
        return contributorList;
    }
}
