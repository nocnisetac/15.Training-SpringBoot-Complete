package com.example.dao;

import java.util.Collection;

import com.example.model.Product;

public interface ProductDao {
	public Collection<Product> findAll();
	public Product find(int id);
}
