package com.storeAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeAPI.beans.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
