package com.example.demo.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@Column(name="employeeNumber")
	int employeeNumber;
	
	@Column(name="lastName")
	String lastName;
	
	@Column(name="firstName")
	String firstName;
	
	@Column(name="extension")
	String extension;
	
	@Column(name="email")
	String email;
	
	@Column(name="officeCode")
	String officeCode;
	
	@Column(name="reportsTo")
	Integer reportsTo;
	
	@Column(name="jobTitle")
	String jobTitle;
	
//	@JsonIgnoreProperties("employees")
//	@OneToMany(mappedBy="customer",cascade =CascadeType.ALL)
//	Set<Customer> customer;
	
	@OneToMany(mappedBy="employee", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("employee")
	Set<Customer> customers;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeNumber, String lastName, String firstName, String extension, String email,
			String officeCode, Integer reportsTo, String jobTitle, Set<Customer> customers) {
		super();
		this.employeeNumber = employeeNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.extension = extension;
		this.email = email;
		this.officeCode = officeCode;
		this.reportsTo = reportsTo;
		this.jobTitle = jobTitle;
		this.customers = customers;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Integer getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(Integer reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", extension=" + extension + ", email=" + email + ", officeCode=" + officeCode + ", reportsTo="
				+ reportsTo + ", jobTitle=" + jobTitle + ", customers=" + customers + "]";
	}


	
	
	
	
	
}
