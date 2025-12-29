package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.repo.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.getAllCustomers();
    }

    public Customer getCustomerById(int id) {
        return repository.getCustomerById(id);
    }

    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }

    public boolean updateCustomer(int id, Customer customer) {
        return repository.updateCustomer(id, customer);
    }

    public boolean deleteCustomer(int id) {
        return repository.deleteCustomer(id);
    }
}
