package com.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public class ProductDaoImp implements ProductDao{
	
@Autowired
private SessionFactory sessionfactory;

	public void addProduct(Product product) {
		System.out.println("add product");
		sessionfactory.getCurrentSession().saveOrUpdate(product);
		
	}
	
	public List<Product> listProduct() {
		Session session = this.sessionfactory.getCurrentSession();
		List<Product> p= session.createQuery("from Product").list();
		
		return p;
	
	}
	public void removePerson(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Integer(id));
		
			session.delete(p);
		
		
	}
	public void updatePerson(Product p) {
		/*Session session = this.sessionfactory.getCurrentSession();*/
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.update(p);
		t.commit();
		s.close();
		
	}
	public Product getPersonById(int id) {
		Session session = this.sessionfactory.getCurrentSession();		
		Product p = (Product) session.load(Product.class, new Integer(id));
		
		return p;
	}

}
