package com.moneyhub.web.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyhub.web.domains.UserDTO;
import com.moneyhub.web.mappers.UserMapper;
import com.moneyhub.web.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired UserMapper userMapper;

	@Override
	public void join(UserDTO param) {
	}

	@Override
	public UserDTO login(UserDTO param) {
		return null;
	}

	@Override
	public List<String> viewMypage() {
		return null;
	}

	@Override
	public UserDTO selectClientById(UserDTO param) {
		return userMapper.selectClientById(param);
	}

	@Override
	public void insertClient(UserDTO param) {
		userMapper.insertClient(param);
	}


}
