package com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartId;
	@OneToOne
	private Person u;
	@OneToMany(cascade=CascadeType.ALL)
	List<Item> listitem;
	/**
	 * @return the cartId
	 */
	public int getCartId() {
		return cartId;
	}
	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	/**
	 * @return the u
	 */
	public Person getU() {
		return u;
	}
	/**
	 * @param u the u to set
	 */
	public void setU(Person u) {
		this.u = u;
	}
	/**
	 * @return the listitem
	 */
	public List<Item> getListitem() {
		return listitem;
	}
	/**
	 * @param listitem the listitem to set
	 */
	public void setListitem(List<Item> listitem) {
		this.listitem = listitem;
	}
	
}
