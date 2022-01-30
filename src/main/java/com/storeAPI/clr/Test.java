package com.storeAPI.clr;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.storeAPI.beans.Client;
import com.storeAPI.beans.Product;
import com.storeAPI.service.ClientService;
import com.storeAPI.service.ManagerService;
import com.storeAPI.service.SuplierService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Test implements CommandLineRunner{

	@Autowired
	public ManagerService managerService;
	@Autowired
	public ClientService clientService;	
	@Autowired
	public SuplierService suplierService;
	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client("elad",Arrays.asList());
		Client c2 = new Client("tom",Arrays.asList());
		Product p1 = new Product("bamba",5,5);
		Product p2 = new Product("cola",7.90,15);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(c1);
		System.out.println(c2);
		suplierService.addProduct(p1);
		suplierService.addProduct(p2);
		clientService.addClient(c1);
		clientService.addClient(c2);
		clientService.purchaseProduct(c1, p1,3);
		clientService.purchaseProduct(c1, p1,3);
		clientService.purchaseProduct(c2, p2,7);
		
		p1.setName("bomba");
		managerService.updateProduct(p1);
	}


	

}