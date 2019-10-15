package com.moneyhub.web.mappers;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.moneyhub.web.domains.AdminDTO;

@Repository
public interface AdminMapper {
	public void insertJoin(AdminDTO param);
	public AdminDTO selectLogin(AdminDTO param);
	public List<String> searchMypage();
	public int countAdmins();
}
