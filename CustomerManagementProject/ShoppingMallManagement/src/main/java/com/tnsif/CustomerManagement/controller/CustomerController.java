package com.tnsif.CustomerManagement.controller;

import java.util.List;

// connect postman

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.CustomerManagement.entity.Customer;
import com.tnsif.CustomerManagement.service.CustomerService;

@RestController   // Handles REST API requests
public class CustomerController {

	@Autowired
	private CustomerService cs;
	
	// POST - Used to create/save a new customer record.
	@PostMapping("/savecustomer")
	public Customer registerCustomer(@RequestBody Customer c) {
		return cs.registerCustomer(c);
	}
	
	// GET - Used to retrieve/display all customer records.
	@GetMapping("/getcustomer")
	public List<Customer> getCustomer() {
		return cs.getCustomers();
	}
	
	// PUT - Used to update an existing customer record.
	@PutMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody Customer c) {
		return cs.updateCustomer(c);
	}
	
	// DELETE - Used to delete a customer record using its ID.
	@DeleteMapping("/deletecustomer/{id}")
	public void deleteCustomer(@PathVariable("id") Integer id) {
		cs.deleteCustomer(id);
	}

}