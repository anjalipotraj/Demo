package com;

import java.util.Scanner;

public class Root_Number {

	public static double root(int num)
	{
		double temp;
		double rootvalue;
		do {
		temp=num/2;
		rootvalue=(temp+(num/temp))/2;
		}
		while ((temp-rootvalue)!=0);
		
		return num;
			
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		int num=sc.nextInt();
		double sqroot=root(num);
		System.out.println("The Squareroot of a Number="+sqroot);
		
		
	}
}
