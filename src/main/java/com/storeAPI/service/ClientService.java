package com.storeAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeAPI.beans.Client;
import com.storeAPI.beans.Product;
import com.storeAPI.repo.ClientRepo;


@Service
public class ClientService {

	@Autowired
	public ClientRepo clientRepo;
	
	public void addClient(Client client){
		
		clientRepo.save(client);
		
	}
	              
	public void purchaseProduct(Client client , Product product , int amount ){
		 client =  clientRepo.getById(client.id);
	    List<Product> products = client.getProducts();
	    if(product.amount>amount) {
	    	for (int i = 0; i < amount; i++) {
	    	    products.add(product);
	    	    product.amount--;
			}
	    	System.out.println(amount+" of the product is purchased");
	    }else {
			System.out.println("product amount is not enough there is only "+product.amount+" in stock"	);
				
		}

		client.setProducts(products);
		clientRepo.save(client);
	}

	
}
