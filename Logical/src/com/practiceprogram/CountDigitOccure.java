package com.practiceprogram;

import java.util.Scanner;

public class CountDigitOccure {

	private static void cuntDigit(int num,int d) {
		// TODO Auto-generated method stub
		int count=0;
		int rem=0;
		while(num>0)
		{
			rem=num/10;
			num=num%10;
			if(num==d)
			{
				count++;
			}
		}
		System.out.println("Total Number of Digit="+count+"Occuring Number="+d);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,d;
		System.out.println("Enter Number=");
		num=sc.nextInt();
		d=sc.nextInt();
		cuntDigit(num,d);
		
	}


}
