package com.service;

import com.model.Contact;
import com.model.Person;

public interface PersonService {
	 public void addPerson(Person person);
	 public void isValidUser(String email , String password);
	 public void addContact(Contact contact);
		 
	

}
