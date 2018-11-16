package com.southwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.southwind.entity.User;
import com.southwind.service.UserService;

@Controller
public class UserController {
	
	@Autowired()
	@Qualifier("myUserService")
	private UserService userService;
	
	public User getUserById(int id){
		return userService.getUserById(id);
	}
}
