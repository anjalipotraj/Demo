package com.practiceprogram;

import java.util.Scanner;

public class StringReverse {

	public static void strReverse(String str)
	{
		char[] str1=str.toCharArray();
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String=");
		str=sc.next();
		strReverse(str);
		
	}
}
