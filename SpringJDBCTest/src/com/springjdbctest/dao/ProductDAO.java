package com.springjdbctest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbctest.model.Product;

@Component
public class ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addProduct(Product product) {
		jdbcTemplate.update("insert into Product values(?,?,?)",product.getId(),product.getName(),product.getAvailableQuantity());
	}
	public void removeProduct(Product product) {
		jdbcTemplate.update("delete from Product where id=?",product.getId());
	}
	public List<Product> viewAllProduct(){
		
		return jdbcTemplate.query("select * from Product",(rs,id)->{Product product = new Product();
		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setAvailableQuantity(rs.getInt("availablequantity"));
		return product;});
	}
	public void UpdateQuantity(int productId, int newquantity){
		jdbcTemplate.update("update Product set availableQuantity=? where id=?",newquantity,productId);
	}
}
