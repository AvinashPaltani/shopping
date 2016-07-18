package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User_Roles;

@Repository
public class User_RolesDaoImp implements User_RolesDao {
	
	@Autowired
	 private SessionFactory sessionFactory;

	public void addRole(User_Roles role) {
		
		sessionFactory.getCurrentSession().save(role);
		
	}

}
