package com.southwind.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.southwind.controller.UserController;
import com.southwind.entity.User;


public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserController userController = (UserController) applicationContext.getBean("userController");
		User user = userController.getUserById(1);
		System.out.println(user);
	}
}
