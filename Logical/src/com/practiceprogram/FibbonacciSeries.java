package com.practiceprogram;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}
}
