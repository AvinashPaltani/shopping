package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CategoryDao;
import com.model.Category;


@Service
@Transactional
public class CategoryServiceImp implements CategoryService  {

	@Autowired
	private CategoryDao categoryDao;
	
	public void addCategory(Category category) {
		categoryDao.addCategory(category);
		
	}

	public List<Category> listCategory() {
		return categoryDao.listCategory();
	}

	public void updateCategory(Category c) {
		this.categoryDao.updateCategory(c);
		
	}

	public void removeCategory(int id) {
		this.categoryDao.removeCategory(id);
		
	}

	public Category getCategoryById(int id) {
		return this.categoryDao.getCategoryById(id);
	}

	
	

}
