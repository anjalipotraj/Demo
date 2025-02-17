package com.example;

import java.util.Scanner;

public class Vowel_Count {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str;
		System.out.println("Enter STring=");
		str=sc.next();
		
		char c[]=str.toCharArray();
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(c[i]=='a'||c[i]=='A'||c[i]=='e'||c[i]=='E'||c[i]=='i'||c[i]=='I'||c[i]=='o'||c[i]=='O'||c[i]=='u'||c[i]=='U') {
				count++;
				System.out.println(c[i]+"="+count);

			}

		}
		if(count==0)
		{
			System.out.println("Vowels not Present");

		}
		
		
		
	}
}
