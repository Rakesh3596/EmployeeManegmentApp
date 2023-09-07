package com.userVerify.service;

import com.userVerify.model.UserDetails;

public interface UserService {
	
	public UserDetails createUser(UserDetails user);

	public boolean checkEmail(String email);

}
