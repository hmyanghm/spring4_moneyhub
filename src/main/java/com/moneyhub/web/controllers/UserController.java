package com.moneyhub.web.controllers;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.moneyhub.web.domains.UserDTO;
import com.moneyhub.web.serviceimpls.UserServiceImpl;

@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired Map<String, Object>map;
	@Autowired UserDTO client;
	@Autowired UserServiceImpl userService;
	
	@PostMapping("/join")
	public @ResponseBody UserDTO join(@RequestBody UserDTO param) {
		logger.info("AJAX가 보낸 아이디와 비번{} ",param.getCid()+","+param.getPwd());
		client.setCid(param.getCid());
		client.setPwd(param.getPwd());
		client.setCname(param.getCname());
		logger.info("map에 담긴 아이디와 비번{} ",client.toString());
		userService.insertClient(param);
		return client;
	}
	
	@PostMapping("/login")
	public @ResponseBody UserDTO login(@RequestBody UserDTO param){
		logger.info("AJAX가 보낸 아이디와 비번{} ",param.getCid()+","+param.getPwd());
		client.setCid(param.getCid());
		client.setPwd(param.getPwd());
		logger.info("client에 담긴 아이디와 비번{} ",client.getCid()+","+client.getPwd());
		return userService.selectClientById(param);
	}
}
