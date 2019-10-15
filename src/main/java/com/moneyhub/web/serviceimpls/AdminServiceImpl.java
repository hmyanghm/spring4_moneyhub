package com.moneyhub.web.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyhub.web.domains.AdminDTO;
import com.moneyhub.web.mappers.AdminMapper;
import com.moneyhub.web.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired AdminMapper adminMapper;
	
	public void join(AdminDTO param) {
	}

	public AdminDTO login(AdminDTO param) {
		return null;
	} 	

	public List<String> viewMypage() {
		return null;
	}

	public int countAdmins() {
		return adminMapper.countAdmins();
	}

	

}
