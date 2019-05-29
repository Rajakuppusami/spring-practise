package com.springjdbctest.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private int orderQuantity;
	@Autowired
	private Product product;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order(int orderId, int orderQuantity, Product product) {
		super();
		this.orderId = orderId;
		this.orderQuantity = orderQuantity;
		this.product = product;
	}
	public Order() {
		super();
	}
	
}
