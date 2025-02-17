package com.example;

import java.util.Scanner;

public class Fequencyof_Charactor {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str;
		System.out.println("Enter String=");
		str=sc.nextLine();
		
		char ch[]=str.toCharArray();  //str=asap;->i=0  j=1
									  //ch[0]==ch[1] f=1 i=0,j=2
									  //ch[0]==ch[2] f=2 i=0 j=3
									 //ch[0]==ch[3] f=3 i=0,j=4

		for(int i=0;i<str.length();i++)
		{
			int feq=1;
			for(int j=1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					feq++;
				}
			}
			
			System.out.println("The Frequency of "+ch[i]+"="+feq);
		}
	}

}
