package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
public class StudentController {

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
	
	// DELETE /delete/{id} → delete student by id
	// Return type: String (status message)


}
