package com.example.resttemplate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.resttemplate.dto.CreateUserDTO;
import com.example.resttemplate.dto.PageDTO;
import com.example.resttemplate.dto.SingleUserDTO;
import com.example.resttemplate.model.Page;
import com.example.resttemplate.service.PageService;

@Service
public class PageServiceImpl implements PageService {
	
	static final String url = "https://reqres.in/api/users";
	
	@Autowired
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public PageDTO getPageUserList(Integer page) {
		
		UriComponents uri = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("page", page)
				.build();
		
		Page pag = restTemplate.getForObject(uri.toUriString(), Page.class);
		
		return new PageDTO(pag);
	}

	@Override
	public SingleUserDTO getSingleUser(Integer id) {
		
		UriComponents uri = UriComponentsBuilder.fromHttpUrl(url)
				.build();
		
		Page pag = restTemplate.getForObject(uri.toUriString() + "/{id}", Page.class, id);
		
		return new SingleUserDTO(pag);
	}

	@Override
	public CreateUserDTO postUser(CreateUserDTO dto) {
		
		UriComponents uri = UriComponentsBuilder.fromHttpUrl(url)
				.build();
		
		CreateUserDTO nUser = new CreateUserDTO();
		nUser.setName(dto.getName());
		nUser.setJob(dto.getJob());
		
		CreateUserDTO user = restTemplate.postForObject(uri.toUriString(), nUser, CreateUserDTO.class);
		
		return user;
	}

}
