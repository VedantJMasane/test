package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

<<<<<<< HEAD
	@Query("Select u from User u where username=:username and password=:password")
	public Optional<User> getLogin(String username,String password);
=======
	@Query("Select u from User u where username=:uid and password=:pwd")
	public Optional<User> getLogin(String uid,String pwd);
>>>>>>> 9da78b98eae938af67cb2a781247835f7984c78c
}
