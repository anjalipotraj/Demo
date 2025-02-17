package com;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,sum=0,rem=0,temp;
		
		System.out.println("Enter Number=");
		num=sc.nextInt();
		temp=num;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)	//1+2+4+7+8+14+28
			{
				sum=sum+i;
			}
		}
		if(temp==sum)
		{
			System.out.println("Inputted Number is Perfect");
		}
		else
		{
			System.out.println("Inputted Number is Not Perfect");
		}
	}
	
}
