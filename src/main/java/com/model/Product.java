package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Proxy;
import org.springframework.web.multipart.MultipartFile;

@Proxy(lazy=false)
@Entity
public class Product implements Serializable {
	
	private static final long serialVersionUID = -723583058586873479L;
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private int price;
	 private String brand;
	 private String desp ;
	 private String name;
	 @Transient
	 private MultipartFile image;
	
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
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
	
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
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
