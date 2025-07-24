package com.example.demo.entities;

public class CustomerRegistration {

	
	int cust_id;
	
	String address;
	
    User user;

	public CustomerRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerRegistration(String address, User user) {
		super();
		this.address = address;
		this.user = user;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
}
