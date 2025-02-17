package com.example;

public class Simple {

	public String m1()
	{
		try {
			return "1";
		} catch (Exception e) {
			// TODO: handle exception
			return "2";
		} finally {
			// TODO: handle finally clause
			return "3";
		}
	}
	public static void main(String[] args) {
		Simple s=new Simple();
		String str=s.m1();
		//System.out.println(str);
		
		
	}	
}

