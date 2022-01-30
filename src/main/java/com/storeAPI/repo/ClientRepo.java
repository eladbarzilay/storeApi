package com.storeAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeAPI.beans.Client;

public interface ClientRepo extends JpaRepository<Client, Integer>{

}
