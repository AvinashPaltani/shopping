package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Cart;

@Repository
public class CartDaoImp implements CartDao {
	@Autowired
	 private SessionFactory sessionFactory;

	public Cart getCartById(int cartId) {
Session session=sessionFactory.getCurrentSession();
		
		return (Cart)session.get(Cart.class,new Integer(cartId));
	}
	
}
