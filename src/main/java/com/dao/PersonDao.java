package com.dao;

import com.model.Person;

public interface PersonDao {
	public void addPerson(Person person);
	public void validUser(String email,String password); 
	

}
