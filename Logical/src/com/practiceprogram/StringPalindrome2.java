package com.practiceprogram;

public class StringPalindrome2 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("asdfghjk");
		StringBuffer temp;
		temp=str;
		str=str.reverse();	
		
		System.out.println(temp+"===="+str);
		if(temp.equals(str))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}
		
	}
}
