package com;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num, sum=0,temp,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			 sum=sum+(rem*rem*rem);
			 num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is Armstrong");

		}
		
	}
}
