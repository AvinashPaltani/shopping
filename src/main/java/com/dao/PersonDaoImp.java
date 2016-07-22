package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Address;
import com.model.Contact;
import com.model.Person;
import com.model.Product;

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

	public List<Contact> getAllCustomer() {
		Session s=sessionFactory.getCurrentSession();
		return s.createQuery("from Contact").list();
	}

	public void removeQuery(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Contact p = (Contact) session.load(Contact.class, new Integer(id));
		
			session.delete(p);
		
	}

	public String insertAddress(Address address) {
		System.out.println("insert address");
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(address);
		System.out.println("insert addresssss");
		t.commit();
		s.close();
		return "success";
	}
	
	 
	 
}
