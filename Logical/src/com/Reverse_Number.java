package com;

import java.util.Scanner;

public class Reverse_Number {
	
	public static void main(String[] args) {
		int num,rem,rev=0,temp;
		Scanner  sc= new Scanner(System.in);
		System.out.println("ENter Number=");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		
			System.out.println("The Reverse Number is="+rev);
		
		
	}

}
