package com.tnsif.CustomerManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.CustomerManagement.entity.Customer;
import com.tnsif.CustomerManagement.repository.CustomerRepo;

@Service // Business logic layer
public class CustomerService {

	@Autowired    // Automatically injects CustomerRepo
	private CustomerRepo cr;

	// Create - Saves a new customer into the database.

	public Customer registerCustomer(Customer c) {
		return cr.save(c);
	}

	// Read - Retrieves all customer records from the database.

	public List<Customer> getCustomers() {
		return (List<Customer>) cr.findAll();
	}

	// Update - Updates an existing customer record in the database.

	public Customer updateCustomer(Customer c) {
		return cr.save(c);
	}

	// Delete - Deletes a customer record based on its ID.

	public void deleteCustomer(Integer id) {
		cr.deleteById(id);
	}

}