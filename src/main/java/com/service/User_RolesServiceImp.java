package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.dao.User_RolesDao;
import com.model.User_Roles;

@Service
@Transactional
public class User_RolesServiceImp implements User_RolesService{
	
	@Autowired
	 private User_RolesDao user_roleDao;

	public void addRole(User_Roles role) {
		user_roleDao.addRole(role);
		
	}

}
