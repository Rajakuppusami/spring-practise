package com.springjdbctest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springjdbctest.dao.ProductDAO;
import com.springjdbctest.model.Product;

@Component
public class ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	
	public void addProduct(Product product){
		productDAO.addProduct(product);
	}
	
	public void removeProduct(Product product){
		productDAO.removeProduct(product);
	}
	public List<Product> viewAllProduct(){
		return productDAO.viewAllProduct();
	}
	public void UpdateQuantity(int productId, int newquantity){
		productDAO.UpdateQuantity(productId, newquantity);
	}
}
