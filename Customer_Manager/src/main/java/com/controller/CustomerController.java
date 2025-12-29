package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping("/customers")
	public String addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return "Customer added successfully";
	}

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}

	@GetMapping("/customers/{id}")
	public Object getCustomer(@PathVariable int id) {
		Customer customer = service.getCustomerById(id);
		if (customer == null) {
			return "Customer not found";
		}
		return customer;
	}

	@PutMapping("/customers/{id}")
	public String updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
		boolean updated = service.updateCustomer(id, customer);
		if (updated) {
			return "Customer updated successfully";
		}
		return "Customer not found";
	}

	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {
		boolean deleted = service.deleteCustomer(id);
		if (deleted) {
			return "Customer deleted successfully";
		}
		return "Customer not found";
	}
}
