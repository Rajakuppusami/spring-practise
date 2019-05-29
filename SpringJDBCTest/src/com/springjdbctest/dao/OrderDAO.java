package com.springjdbctest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbctest.model.Order;
import com.springjdbctest.service.ProductService;

@Component
public class OrderDAO {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Autowired
	private ProductService productService;
	
	public void addOrder(Order order){
		jdbctemplate.update("insert into Orders values(?,?,?)",order.getOrderId(),order.getOrderQuantity(),order.getProduct().getId());
		productService.UpdateQuantity(order.getProduct().getId(), order.getProduct().getAvailableQuantity()-order.getOrderQuantity());
	}
}
