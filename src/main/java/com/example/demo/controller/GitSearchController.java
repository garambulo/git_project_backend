package com.example.demo.controller;

import com.example.demo.Entities.Search;
import com.example.demo.service.GitSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitSearchController {

    @Autowired
    GitSearchService gitSearchService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/search/{repositoryName}")
    public Search getSearchResult(@PathVariable("repositoryName") String repositoryName){
        return gitSearchService.getSearchedItem(repositoryName);
    }
}
