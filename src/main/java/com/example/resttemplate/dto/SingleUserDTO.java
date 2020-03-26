package com.example.resttemplate.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.example.resttemplate.model.Company;
import com.example.resttemplate.model.Page;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
public class SingleUserDTO {
	
	private List<UserDTO> data;
	private Company ad;
	
	public SingleUserDTO(Page page) {
		this.data = page.getData()
				.stream()
				.map(UserDTO::new)
				.collect(Collectors.toList());
		this.ad = page.getAd();
	}

}
