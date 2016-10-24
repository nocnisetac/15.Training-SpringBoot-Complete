package com.example.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.model.Product;

@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Collection<Product> findAll() {
		return this.jdbcTemplate.query("select * from product", new BeanPropertyRowMapper<Product>(Product.class));
	}

	@Override
	public Product find(int id) {
		return jdbcTemplate.queryForObject("select * from product where id = ?", new BeanPropertyRowMapper<Product>(Product.class), id);
	}

}
