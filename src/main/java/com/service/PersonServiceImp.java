package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PersonDao;
import com.model.Person;

@Service("PersonService")
@Transactional

public class PersonServiceImp implements PersonService {
	
	

	 @Autowired
	 private PersonDao personDao;
	 
	 @Transactional
	 public void addPerson(Person person) {
	  personDao.addPerson(person);
	 }

	


}
