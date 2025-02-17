package com.example;

public class C extends B{
	
	public C()
	{
		System.out.println("I am in C");
	}
	static {
		System.out.println("I am in static C");
	}

	

	public static void main(String[] args) {
				
		C c=new C();
		
	}
}
