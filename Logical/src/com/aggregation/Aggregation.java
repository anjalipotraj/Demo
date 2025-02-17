package com.aggregation;

public class Aggregation {

	public static void main(String[] args) {
		
		Address ad1=new  Address("Solapur", "Pune", 413001);
		Address ad2= new Address("Mumbai", "Banglore", 324001);
		
		Student s1=new Student(1, "Anjali", 70.53, ad1);
		Student s2=new Student(2, "Pooja", 67.65, ad2);
		System.out.println("-------------Student 1 Information--------");
		System.out.println(s1.getRoll()+" "+s1.getName()+" "+s1.getPer()+" "+s1.getAddress().getLaddress()+" "+s1.getAddress().getPaddress());
		System.out.println(s2.getRoll()+" "+s2.getName()+" "+s2.getPer()+" "+s2.getAddress().getLaddress()+" "+s2.getAddress().getPaddress()+" "+s1.getAddress().getPincode());
		System.out.println(s2);
	}
}
