package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepo;
	
<<<<<<< HEAD
	public User getLogin(String username,String password)
	{
		User u;
	    Optional<User> ol = userrepo.getLogin(username, password);
=======
	public User getLogin(String uid,String pwd)
	{
		User u;
	    Optional<User> ol = userrepo.getLogin(uid, pwd);
>>>>>>> 9da78b98eae938af67cb2a781247835f7984c78c
	    
	    try
	    {
	    	u = ol.get();
	    }
	    catch(Exception e)
	    {
	    	u = null;
	    }
		return u;

	}
	
	public User getById(int user_id)
	{
		return userrepo.findById(user_id).get();
	}
}
