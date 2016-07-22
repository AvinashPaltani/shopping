package com.dao;

import com.model.Cart;
import com.model.Item;

public interface CartItemDao {
	public void addCartItem(Item cartItem);

    public void removeCartItem(Item cartItem);
    Item getCartItemByProductId(int productId);


    public void removeAllCartItems(Cart cart);

}
