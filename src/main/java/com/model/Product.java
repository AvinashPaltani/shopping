package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Proxy;

@Proxy(lazy=false)
@Entity
public class Product implements Serializable {
	
	private static final long serialVersionUID = -723583058586873479L;
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private int price;
	 private String brand;
	


	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String name;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String desp ;
	 public Product()
	 {}
	 public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}
	

	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	
	
}
