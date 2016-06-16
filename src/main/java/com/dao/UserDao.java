package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements UserDaoInterface {

	public boolean isValidUser(String name, String password) {
		
		if(name.equals("ram")&&password.equals("ramlal@123"))
     {
    	 return true;
	 }
     else
     {
    	 return false; 
     }
	}
}
