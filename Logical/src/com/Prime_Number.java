package com;

import java.util.Scanner;

public class Prime_Number {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,f=0,counter=0;
		System.out.println("Enter Number=");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				counter++;
		}
		
		if(counter==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
}
