package com.practiceprogram;

import java.util.Scanner;

public class SwapProgram {

	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number A=");
		a=sc.nextInt();
		System.out.println("Enter Number B=");
		b=sc.nextInt();
		
		a=a+b;	//30=10+20
		b=a-b;	//10=30-20
		a=a-b;	//20=30-10
		
		System.out.println("After swapping");
		System.out.println("A="+a+"            "+"B="+b);
		
		
	}
}
