package com.example.demo.util;

import static com.example.demo.util.GithubURI.*;

public class GithubAPIUtil {

    public String getSearchURL(String repositoryName) {
        return BASE_URL.concat(SEARCH)
                .concat(REPOSITORIES)
                .concat(QUERY)
                .concat(repositoryName)
                .concat(AND)
                .concat(PUBLIC_RESULT);
    }

}
