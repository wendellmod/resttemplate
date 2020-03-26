package com.example.resttemplate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.resttemplate.dto.CreateUserDTO;
import com.example.resttemplate.dto.PageDTO;
import com.example.resttemplate.dto.SingleUserDTO;
import com.example.resttemplate.service.PageService;

@RestController
public class ConsumeWebService {
	
	@Autowired
	private PageService service;
	
	@GetMapping("/listusers")
	public PageDTO getPageUserList(@RequestParam Integer page) {
		return service.getPageUserList(page);
	}
	
	// Esse GET está dando erro
	// Anotação para lembrar de arrumar
	@GetMapping("/singleusers/{id}")
	public SingleUserDTO getSingleUser(@PathVariable Integer id) {
		return service.getSingleUser(id);
	}
	
	@PostMapping("/createusers")
    @ResponseStatus(HttpStatus.CREATED)
	public CreateUserDTO postUser(@RequestBody @Valid CreateUserDTO dto) {
		return service.postUser(dto);
	}

}
