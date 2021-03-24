package com.example.demo.util;

import lombok.Getter;

public class GithubURI {
    public static final String BASE_URL = "https://api.github.com";
    public static final String SEARCH = "/search";
    public static final String REPOSITORIES = "/repositories";
    public static final String REPOS = "/repos";
    public static final String QUERY = "?q=";
    public static final String CONTRIBUTORS = "/contributors";
    public static final String USERS = "/users";
    public static final String COMMITS = "/commits";
    public static final String PUBLIC_RESULT = "private:false";
    public static final String LIMIT_RESULT_TO_HUNDRED = "per_page=100";
    public static final String AND = "&";
}
