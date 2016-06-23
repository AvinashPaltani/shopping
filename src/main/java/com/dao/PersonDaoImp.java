package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Person;

@Repository("PersonDao")
public class PersonDaoImp implements PersonDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 public void addPerson(Person person) {
	   sessionFactory.getCurrentSession().saveOrUpdate(person);
	 }
}
