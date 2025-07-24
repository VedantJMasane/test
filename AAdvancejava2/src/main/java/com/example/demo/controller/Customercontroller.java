package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.Customerservice;

@RestController
@RequestMapping("/customer")
public class Customercontroller {

	@Autowired 
	Customerservice custservice;

	    @GetMapping("/all")
	    public List<Customer> getAll() {
	        return custservice.getAll();
	    }

	    @GetMapping("/getone/{id}")
	    public Customer getOne(@PathVariable int id) {
	        return custservice.findById(id);
	    }

	    @GetMapping("/getbycustomerandcredit")
	    public List<Customer> getByCustomerAndCredit(@RequestParam String customerName,
	                                                 @RequestParam BigDecimal creditLimit) {
	        return custservice.findByCustomerNameAndCreditLimit(customerName, creditLimit);
	    }
}
