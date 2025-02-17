package com.aggregation;

public class Student {

	private int roll;
	
	private String name;
	
	private double per;
	
	private Address address;

	public Student(int roll, String name, double per, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.per = per;
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public double getPer() {
		return per;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", per=" + per + ", address=" + address + "]";
	}
	
}
