package com.userVerify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.userVerify.model.UserDetails;
import com.userVerify.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	
//	@PostMapping("/createUser")
//	public String createuser(@ModelAttribute UserDetails user, HttpSession session) {
//
//		boolean f = userService.checkEmail(user.getEmail());
//
//		if (f) {
//			session.setAttribute("msg", "Email Id alreday exists");
//		}
//
//		else {
//			UserDetails userDtls = userService.createUser(user);
//			if (userDtls != null) {
//				session.setAttribute("msg", "Register Sucessfully");
//			} else {
//				session.setAttribute("msg", "Something wrong on server");
//			}
//		}
//
//		return "redirect:/register";
//	}

}
