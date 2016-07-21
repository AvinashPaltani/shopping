package com.dao;

import java.util.List;

import com.model.Contact;
import com.model.Person;

public interface PersonDao {
	public void addPerson(Person person);
	public void validUser(String email,String password); 
	public void addContact(Contact contact);
	public List<Contact> getAllCustomer();
	public void removeQuery(int id);
}
