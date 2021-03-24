package com.example.demo.service;

import com.example.demo.Entities.Commit;
import com.example.demo.util.GithubAPIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GitCommitService {
    private GithubAPIUtil githubAPIUtil;

    @Autowired
    public GitCommitService(){
        githubAPIUtil = new GithubAPIUtil();
    }
    public List<Commit> getCommits(String committerName, String repositoryName){
        RestTemplate restTemplate = new RestTemplate();
        String oneHundredCommitsURL = githubAPIUtil.getOneHundredCommitsURL(committerName,repositoryName);
        List<Commit> commitList = restTemplate.getForObject(oneHundredCommitsURL, List.class);
        return commitList;
    }
}
