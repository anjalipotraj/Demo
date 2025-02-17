package com;

import java.util.Scanner;

public class FibonnaciSeries {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int num,a=0,b=1,c;
	System.out.println("ENter Number=");
	num=sc.nextInt();
	System.out.println(a);
	System.out.println(b);
	for(int i=1;i<=num;i++)
	{
		
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	
}
}
