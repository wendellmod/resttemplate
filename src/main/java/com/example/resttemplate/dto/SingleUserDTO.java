package com.example.resttemplate.dto;

import com.example.resttemplate.model.Company;

import lombok.Data;

@Data
public class SingleUserDTO {
	
	private UserDTO data;
	private Company ad;

}
