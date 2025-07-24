package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.entity.Customer;

@Service
public class Customerservice {

	 @Autowired
	    CustomerRepository customerRepo;

	    public List<Customer> getAll() {
	        return customerRepo.findAll();
	    }

	    public Customer findById(int id) {
	        return customerRepo.findById(id).orElse(null);
	    }

	    public List<Customer> findByCustomerNameAndCreditLimit(String name, BigDecimal creditLimit) {
	        return customerRepo.findByCustomerNameAndCreditLimit(name, creditLimit);
	    }

}
