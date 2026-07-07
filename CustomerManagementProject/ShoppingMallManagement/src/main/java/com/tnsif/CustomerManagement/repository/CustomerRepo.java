package com.tnsif.CustomerManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.tnsif.CustomerManagement.entity.Customer;

// SQL Queries
// Database
//Used to perform CRUD operations on the Customer table
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}