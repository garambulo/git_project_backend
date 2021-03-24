package com.example.demo.util;

import static com.example.demo.util.GithubURI.*;

public class GithubAPIUtil {

    public String getSearchURL(String repositoryName) {
        return BASE_URL.concat(SEARCH)
                .concat(REPOSITORIES)
                .concat(QUESTION_MARK)
                .concat(QUERY)
                .concat(repositoryName)
                .concat(AND)
                .concat(PUBLIC_RESULT);
    }

    public String getOneHundredCommitsURL(String committerName, String repositoryName){
        return BASE_URL.concat(REPOS)
                .concat(concatURIParam(committerName))
                .concat(concatURIParam(repositoryName))
                .concat(COMMITS)
                .concat(QUESTION_MARK)
                .concat(LIMIT_RESULT_TO_HUNDRED);
    }
    private String concatURIParam(String param){
        return  '/' + param ;
    }

}
