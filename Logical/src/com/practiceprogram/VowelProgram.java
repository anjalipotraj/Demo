package com.practiceprogram;

import java.util.Scanner;

public class VowelProgram {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr String=");
		str=sc.next();
		str.toLowerCase();
		char str1[]=str.toCharArray();
		
		for(int i=0;i<str1.length-1;i++)
		{
			if(str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u')
			{
				System.out.println("Vowels Present in given String");
			}
			else {
				System.out.println("Vowels not present");
			}
		}
	}
	
	
}
