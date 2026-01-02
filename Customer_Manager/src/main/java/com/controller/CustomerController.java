package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {

	// @Autowired injects CustomerService dependency

	// CustomerService reference variable
	
	// Handle POST request to add a new customer
	// Read customer data from request body
	// Return type: String (success message)
	
	// Handle GET request to fetch all customers
	// Return type: List<Customer>
	
	// Handle GET request to fetch customer by id
	// Read id from URL path
	// Return type: Object (Customer or error message)
	
	// Handle PUT request to update customer by id
	// Read id from URL path and customer data from request body
	// Return type: String (status message)
	
	// Handle DELETE request to delete customer by id
	// Read id from URL path
	// Return type: String (status message)

}
