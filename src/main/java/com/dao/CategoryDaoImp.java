package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Category;

@Repository
public class CategoryDaoImp implements CategoryDao {
	
	@Autowired
	private SessionFactory sessionfactory;

		public void addCategory(Category category) {
			System.out.println("add category");
			sessionfactory.getCurrentSession().saveOrUpdate(category);
			
		}
		
		public List<Category> listCategory() {
			Session session = this.sessionfactory.getCurrentSession();
			List<Category> c= session.createQuery("from Category").list();
			
			return c;
		
		}
		public void removeCategory(int id) {
			Session session = this.sessionfactory.getCurrentSession();
			Category c = (Category) session.load(Category.class, new Integer(id));
			
				session.delete(c);
			
			
		}
		public void updateCategory(Category c) {
			Session s=sessionfactory.openSession();
			Transaction t=s.beginTransaction();
			System.out.println("update is"+c.getId());
			s.update(c);
			t.commit();
			s.close();
			
		}
		public Category getCategoryById(int id) {
			Session session = this.sessionfactory.getCurrentSession();		
			Category c = (Category) session.load(Category.class, new Integer(id));
			
			return c;
		}
	
	
}
