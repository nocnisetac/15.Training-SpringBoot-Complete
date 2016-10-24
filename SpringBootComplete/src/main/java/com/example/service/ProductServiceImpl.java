package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDao;
import com.example.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public Collection<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	public Product find(int id) {
		return productDao.find(id);
	}

}
