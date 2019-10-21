package com.moneyhub.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.moneyhub.web.domains.UserDTO;

@Component
public interface UserService {
	public void join(UserDTO param);
	public UserDTO login(UserDTO param);
	public List<String> viewMypage();
	public UserDTO selectClientById(UserDTO param);
	public void insertClient(UserDTO param);
}
