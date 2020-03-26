package com.example.resttemplate.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Page {
	
	private Integer page;
	private Integer per_page;
	private Integer total;
	private Integer total_pages;
	private List<User> data;
	private Company ad;

}
