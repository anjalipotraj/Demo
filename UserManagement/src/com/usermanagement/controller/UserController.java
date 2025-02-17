package com.usermanagement.controller;

import com.usermanagement.module.UserModule;
import com.usermanagement.serviceimpl.UserService;

public class UserController {

	public static void main(String[] args) {
		System.out.println("User Controller Started......");
		Login();
		System.out.println("USer Controller Completed.......");
	}
	
	public static void Login()
	{
		 UserModule user=new UserModule();
		 user.setId(1);
		 user.setUname("admin");
		 user.setPass("test123");
		 
		 UserService userService=new UserService();
		 boolean status=userService.login(user);
		 System.out.println("User Login Status="+status);
	}
}
