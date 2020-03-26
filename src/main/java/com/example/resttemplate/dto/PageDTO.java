package com.example.resttemplate.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.example.resttemplate.model.Company;
import com.example.resttemplate.model.Page;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
public class PageDTO {
	
	private Integer page;
	private Integer per_page;
	private Integer total;
	private Integer total_pages;
	private List<UserDTO> data;
	private Company ad;
	
	public PageDTO(Page page) {
		this.page = page.getPage();
		this.per_page = page.getPer_page();
		this.total = page.getTotal();
		this.total_pages = page.getTotal_pages();
		this.data = page.getData().stream()
				.map(UserDTO::new)
				.collect(Collectors.toList());
		this.ad = page.getAd();
		
	}

}
