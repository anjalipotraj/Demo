package com.example;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter String=");
		str = sc.next();
		String rev = "";

		// String Palindrome using String Function

//		for (int i = str.length() - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		if (str.equals(rev)) {
//			System.out.println("String is Palindrome");
//		} else {
//			System.out.println("String isnot Palindrome");
//		}
		
		//Without Using String Function
		char a[]=str.toCharArray();
		
		for(int i=0;i<=str.length()-1;i++)
		{
		for(int j=a.length-1;j>=0;j--)
		{
			if(a[j]==str.charAt(i))
			{
				System.out.println("String Palindrome");

			}
			}
		}

		
	}
}
