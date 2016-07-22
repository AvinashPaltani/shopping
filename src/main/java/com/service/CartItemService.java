package com.service;

import com.model.Item;

public interface CartItemService {
	public void addCartItem(Item cartItem);
	public Item getCartItemByProductId(int productId);
}
