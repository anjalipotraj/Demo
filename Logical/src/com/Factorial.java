package com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num, f=1,i=1;
		System.out.println("Enter Number=");
		num=sc.nextInt();
		while(num>=i)
		{
			f=f*i;
			i++;
			
		}
		System.out.println("Factorial="+f);
	}
}
