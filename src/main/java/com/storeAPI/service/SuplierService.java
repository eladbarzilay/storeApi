package com.storeAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.storeAPI.beans.Product;
import com.storeAPI.repo.ProductRepo;

@Component
public class SuplierService {

	@Autowired
	public ProductRepo productRepo;
	
	public void addProduct(Product product){
		
		productRepo.save(product);

	}

}