package com.example.demo.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Commit{
    public String sha;
    public String node_id;
    public Commit commit;
    public String url;
    public String html_url;
    public String comments_url;
    public Author author;
    public Committer committer;;
}