package com.userVerify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userVerify.model.UserDetails;

@Repository
public interface UserDao extends JpaRepository<UserDetails, Integer>{
	
	public boolean existsByEmail(String email);

	public UserDetails findByEmail(String email);

}
