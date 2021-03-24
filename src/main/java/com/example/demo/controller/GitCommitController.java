package com.example.demo.controller;

import com.example.demo.Entities.Commit;
import com.example.demo.service.GitCommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GitCommitController {
    @Autowired
    GitCommitService gitCommitService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/commits/{committerName}/{repositoryName}")
    public List<Commit> getCommitList(@PathVariable("committerName") String committerName,
                                          @PathVariable("repositoryName") String repositoryName){
        return gitCommitService.getCommits(committerName, repositoryName);
    }
}
