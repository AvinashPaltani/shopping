package com.service;

import java.util.List;

import com.model.Address;
import com.model.Contact;
import com.model.Person;

public interface PersonService {
	 public void addPerson(Person person);
	 public void isValidUser(String email , String password);
	 public void addContact(Contact contact);
	 public List<Contact> getAllCustomer(); 
	 public void removeQuery(int id);
	 public String insertAddress(Address address);

}
