package com.dao;

import java.util.List;
import com.model.Product;

public interface ProductDao {

	 public void addProduct(Product product);
	 public List<Product> listProduct();
	 public void removePerson(int id);
	 public void updatePerson(Product p);
	 public Product getPersonById(int id);
	 
}

