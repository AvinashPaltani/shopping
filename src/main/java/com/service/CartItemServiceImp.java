package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CartItemDao;
import com.model.Item;

@Service
@Transactional
public class CartItemServiceImp implements CartItemService{
	@Autowired
	CartItemDao cartItemDao;

	public void addCartItem(Item cartItem) {
            cartItemDao.addCartItem(cartItem);
	}

	public Item getCartItemByProductId(int productId) {
		 return cartItemDao.getCartItemByProductId(productId);
	}
	
}
