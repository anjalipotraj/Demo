package com.example;

public class NumberofDigit {

	public static void main(String[] args) {
		int i=1234456;
		int count=0;
		
		while(i>0)
		{
			i=i/10;
			count++;
			
		}
		System.out.println("Number of Digit="+count);
	}
}
