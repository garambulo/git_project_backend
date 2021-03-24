package com.example.demo.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Search {
    public int total_count;
    public boolean incomplete_results;
    public List<Item> items;
}
