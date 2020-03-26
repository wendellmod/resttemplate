package com.example.resttemplate.service;

import com.example.resttemplate.dto.CreateUserDTO;
import com.example.resttemplate.dto.PageDTO;
import com.example.resttemplate.dto.SingleUserDTO;

public interface PageService {

	PageDTO getPageUserList(Integer page);

	SingleUserDTO getSingleUser(Integer id);

	CreateUserDTO postUser(CreateUserDTO dto);

}
