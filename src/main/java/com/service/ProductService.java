package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	
	 public void addProduct(Product product);
	 public List<Product> listProduct();
	 public void updatePerson(Product p);
	 public void removePerson(int id);
	 public Product getPersonById(int id);

}
