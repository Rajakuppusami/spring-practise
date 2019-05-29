package com.springjdbctest.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int id;
	private String name;
	private int availableQuantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public Product(int id, String name, int availableQuantity) {
		super();
		this.id = id;
		this.name = name;
		this.availableQuantity = availableQuantity;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", availableQuantity=" + availableQuantity + "]";
	}
	
}
