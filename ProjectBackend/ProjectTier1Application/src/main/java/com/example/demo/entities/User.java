package com.example.demo.entities;


<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> 9da78b98eae938af67cb2a781247835f7984c78c

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
=======
import jakarta.persistence.OneToOne;
>>>>>>> 9da78b98eae938af67cb2a781247835f7984c78c
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int user_id;
	
	@Column(name="username")
	 String username;
	
	@Column(name="password")
     String password;
	
	@Column(name="name")
	 String name;
	
	@Column(name="contact_no")
	 String contact_no;
	
<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name = "role_id")
	Role role_id;

	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public User(String username, String password, String name, String contact_no, Role role_id) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.contact_no = contact_no;
		this.role_id = role_id;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public Role getRole_id() {
		return role_id;
	}

	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}
=======
	 @OneToOne(mappedBy = "user")
	 @JsonIgnore
	 Customer customer;
>>>>>>> 9da78b98eae938af67cb2a781247835f7984c78c
	
	
}
