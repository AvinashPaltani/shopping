package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.PersonDao;
import com.model.Contact;
import com.model.Person;

@Service
@Transactional
public class PersonServiceImp implements PersonService {
	
	 @Autowired
	 private PersonDao personDao;
	 
	 public void addPerson(Person person) {
	  personDao.addPerson(person);
	 }
	public void isValidUser(String email, String password) {
		 personDao.validUser( email, password);
		
		
	}
	public void addContact(Contact contact) {
	
		personDao.addContact(contact);
	}
	public List<Contact> getAllCustomer() {
		return personDao.getAllCustomer();
	}
	public void removeQuery(int id) {
		this.personDao.removeQuery(id);
		
	}

	


}
