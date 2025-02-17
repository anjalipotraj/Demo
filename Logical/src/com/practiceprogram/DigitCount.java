package com.practiceprogram;

import java.util.Scanner;

public class DigitCount {
	
	public static void countDigit(int num) {
		// TODO Auto-generated method stub
		int count=0;
		int rem=0;
		
		while(num>0)	//789
		{
			num=num/10;
			count++;
			
		}
		
		System.out.println("Total Digit in number="+count);
		
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter Number");
	num=sc.nextInt();
	countDigit(num);
}


}
