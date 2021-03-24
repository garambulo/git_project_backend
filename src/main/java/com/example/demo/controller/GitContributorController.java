package com.example.demo.controller;

import com.example.demo.Entities.Contributor;
import com.example.demo.service.GitContributorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GitContributorController {
    @Autowired
    GitContributorService gitContributorService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/contributors/{author}/{repositoryName}")
    public List<Contributor> getContributors(@PathVariable("author") String author,
                                             @PathVariable("repositoryName") String repositoryName){
        return gitContributorService.getContributorList(author, repositoryName);
    }
}
