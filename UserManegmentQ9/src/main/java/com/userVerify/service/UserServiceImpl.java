package com.userVerify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userVerify.model.UserDetails;
import com.userVerify.repository.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao dao;
	

	@Override
	public UserDetails createUser(UserDetails user) {
		return dao.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		return dao.existsByEmail(email);
	}

}
