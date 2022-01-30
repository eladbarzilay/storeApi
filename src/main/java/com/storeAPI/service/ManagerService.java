package com.storeAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeAPI.beans.Product;
import com.storeAPI.repo.ProductRepo;

@Service
public class ManagerService {

	@Autowired
	public ProductRepo productRepo;
	
	
	public void updateProduct(Product product){
		
		productRepo.saveAndFlush(product);

	}
}
