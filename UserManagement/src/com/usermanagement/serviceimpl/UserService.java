package com.usermanagement.serviceimpl;

import com.usermanagement.module.UserModule;

public class UserService {

	public boolean login(UserModule user) {
		boolean flag=false;
		if(user==null) {
			throw new RuntimeException("User should not be Null");
		}
		if(user.getUname()==null)
		{
			throw new RuntimeException("User Name Should not be Null");
		}
		if(user.getPass()==null)
		{
			throw new RuntimeException("Password Should not be Null");
		}
		if(user.getUname().equals("admin")&&user.getPass().equals("test123"))
		{
			flag=true;
			
		}
		System.out.println("Login Method Completed........");
		return flag;
	}
}
