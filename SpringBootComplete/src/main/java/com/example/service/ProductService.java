package com.example.service;

import java.util.Collection;

import com.example.model.Product;

public interface ProductService {
	public Collection<Product> findAll();
	public Product find(int id);
}
