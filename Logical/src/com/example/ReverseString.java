package com.example;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String=");
		String str=sc.next();
		
		StringBuffer sbf=new StringBuffer(str);
		System.err.println("Using string Function");
		System.out.println(sbf.reverse());
		
		System.out.println("=================================");
		System.out.println("Using Iterator");
		char[] revstr=str.toCharArray();
		for(int i=revstr.length-1;i>=0;i--)
		{
			System.out.print(revstr[i]);
		}
	}
}
