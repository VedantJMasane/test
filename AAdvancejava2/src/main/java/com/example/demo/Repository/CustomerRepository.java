package com.example.demo.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByCustomerNameAndCreditLimit(String name, BigDecimal creditLimit);

}
