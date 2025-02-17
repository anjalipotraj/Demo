package com.usermanagement.serviceimpl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.usermanagement.module.UserModule;
import com.usermanagement.serviceimpl.UserService;

class UserServiceImplTest {

	@Test
	void testHappy() {
		//fail("Not yet implemented");
		UserModule user=new UserModule();
		user.setUname("admin");
		user.setPass("test123");
		
		UserService service=new UserService();
		boolean actual=service.login(user);
		//assertTrue(actual);
		assertEquals(true, actual);
	}
	@Test
	void testInvalidPass() {
		//fail("Not yet implemented");
		UserModule user=new UserModule();
		user.setUname("admin");
		user.setPass("test1234");
		
		UserService service=new UserService();
		boolean actual=service.login(user);
		assertEquals("Invalid Password",false,actual);
		
	}
	@Test
	void testInvalidUname() {
		//fail("Not yet implemented");
		UserModule user=new UserModule();
		user.setUname("Admin");
		user.setPass("test123");
		
		UserService service=new UserService();
		boolean actual=service.login(user);
		assertEquals("Invalid Uname",false,actual);
		
	}
	@Test
	void testNullUname() {
		//fail("Not yet implemented");
		UserModule user=new UserModule();
		user.setUname(null);
		user.setPass("test1234");
		
		UserService service=new UserService();
		assertThrows(RuntimeException.class, ()->service.login(user));
		
	}
	@Test
	void testNullPass() {
		//fail("Not yet implemented");
		UserModule user=new UserModule();
		user.setUname("admin");
		user.setPass(null);
		
		UserService service=new UserService();
		assertThrows(RuntimeException.class, ()->service.login(user));
		
	}
	@Test
	void testNullUser() {
		//fail("Not yet implemented");
		UserService service=new UserService();
		assertThrows(RuntimeException.class, ()->service.login(null));
		
	}
}
