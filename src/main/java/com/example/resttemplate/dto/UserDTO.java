package com.example.resttemplate.dto;

import com.example.resttemplate.model.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
public class UserDTO {
	
	private Integer id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.email = user.getEmail();
		this.first_name = user.getFirst_name();
		this.last_name = user.getLast_name();
		this.avatar = user.getAvatar();
	}

}
