package com.moneyhub.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.moneyhub.web.domains.AdminDTO;

@Component
public interface AdminService {
	public void join(AdminDTO param);
	public AdminDTO login(AdminDTO param);
	public List<String> viewMypage();
	public int countAdmins();
}
