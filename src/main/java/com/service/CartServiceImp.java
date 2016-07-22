package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CartDao;
import com.model.Cart;

@Service
@Transactional
public class CartServiceImp implements CartService{
	@Autowired
	CartDao cartDao;

	public Cart getCartById(int cartId) {
		return cartDao.getCartById(cartId);
	}
}
