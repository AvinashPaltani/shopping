package com.service;

import java.util.List;

import com.model.Category;

public interface CategoryService {
	
	public void addCategory(Category category);
	 public List<Category> listCategory();
	 public void removeCategory(int id);
	 public void updateCategory(Category c);
	 public Category getCategoryById(int id);


}
