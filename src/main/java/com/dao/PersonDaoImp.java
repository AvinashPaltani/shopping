package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Contact;
import com.model.Person;

@Repository
public class PersonDaoImp implements PersonDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	 

	public void addPerson(Person person) {
		sessionFactory.getCurrentSession().save(person);
		
	}

	public void validUser(String email, String password) {
		Session s=sessionFactory.getCurrentSession();
		Query q=s.createQuery("from Person");
	q.uniqueResult();
	
		
	}

	public void addContact(Contact contact) {
		
		sessionFactory.getCurrentSession().save(contact);
	}
	
	 
	 
}
