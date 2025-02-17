package com;

import java.util.Scanner;

public class Palindrome_Number {
	
	public static void main(String[] args) {
		int num,rev=0,temp,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number isnot Palindrome");
		}
	}

}
