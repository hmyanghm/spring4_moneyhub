package com.moneyhub.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moneyhub.web.domains.UserDTO;

@Repository
public interface UserMapper {
	public UserDTO selectLogin(UserDTO param);
	public List<String> searchMypage();
	public UserDTO selectClientById(UserDTO param);
	public void insertClient(UserDTO param);
}
