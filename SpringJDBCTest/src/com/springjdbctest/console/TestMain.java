package com.springjdbctest.console;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbctest.model.Order;
import com.springjdbctest.model.Product;
import com.springjdbctest.service.OrderService;
import com.springjdbctest.service.ProductService;

public class TestMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbctest/configuration/bean.xml");
		Product product =new Product(2,"Sony ",20);
		/*Product product =(Product) context.getBean("product");
		product.setId(2);
		product.setName("Sony Mobile");
		product.setAvailableQuantity(20);*/
		ProductService p = (ProductService) context.getBean("productService");
		p.addProduct(product);
		OrderService o = (OrderService) context.getBean("orderService");
		
		Order order =new Order(1,10,product);
		o.addOrder(order);
		System.out.println(p.viewAllProduct());
	} 

}
