package com.flm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.dao.AdminDao;
import com.flm.model.Admin;

@Component
public class AdminService {
	
	@Autowired
	AdminDao adminDao;
	
	public Admin loginAdmin(String userName, String password) {
		
		Admin admin = adminDao.findAdminByUserName(userName);
		
		if(admin!=null && admin.getPassword().equals(password)) {
			return admin;
		}
		return null;
	}
	
	public String singupAdmin(String userName, String password) {
		Admin admin=new Admin(userName, password);
		
		return adminDao.signup(admin);
		 
	}

}
