package com.springjdbctest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springjdbctest.dao.OrderDAO;
import com.springjdbctest.model.Order;

@Component
public class OrderService {
	@Autowired
	private OrderDAO orderdao;
	
	public void addOrder(Order order){
		orderdao.addOrder(order);
	}
}
