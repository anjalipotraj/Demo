package com.practiceprogram;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void strPalindrome(String str)
	{
		char str1[]=str.toCharArray();
		char temp[]=new char[str.length()];
		int j=0;
		for(int i=str1.length-1;i>=0;i--) {
			temp[j]=str1[i];
			j++;
		}
		for(int i=0;i<str1.length-1;i++)
		{
			if(str1[i]==temp[i])
		
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String not Palindrome");
		}
		}
	}
	
public static void main(String[] args) {
	String str;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter String=");
	str=sc.next();
	strPalindrome(str);
}
}
