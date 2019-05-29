package com.springjdbctest.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet arg0, int arg1) throws SQLException {
		Product product = new Product();
		product.setId(arg0.getInt("id"));
		product.setName(arg0.getString("name"));
		return product;
	}

}
