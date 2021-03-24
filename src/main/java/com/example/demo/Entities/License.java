package com.example.demo.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class License{
    public String key;
    public String name;
    public String spdx_id;
    public String url;
    public String node_id;
}