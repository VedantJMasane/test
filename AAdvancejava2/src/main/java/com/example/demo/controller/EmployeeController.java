package com.example.demo.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Employeeservice;

@RestController
public class EmployeeController {

	@Autowired
	Employeeservice empservice;

}
