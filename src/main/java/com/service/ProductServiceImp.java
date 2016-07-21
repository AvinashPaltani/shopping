package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.model.Product;

@Service
@Transactional
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}

	public List<Product> listProduct() {
		return productDao.listProduct();
	}

	public void updatePerson(Product p) {
		this.productDao.updatePerson(p);
		
	}

	public void removePerson(int id) {
		this.productDao.removePerson(id);
		
	}

	public Product getPersonById(int id) {
		
		return this.productDao.getPersonById(id);
	}

}
