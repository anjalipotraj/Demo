package com.example;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1234;
		int temp,rev=0,rem;
	
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Number in Reverse="+rev);
		System.out.println("===================================");
		int num2=9876;
		String str=String.valueOf(num2);
		StringBuilder sb=new StringBuilder(str);
		int i=Integer.parseInt(sb.reverse().toString());
		System.out.println("Number in Reverse"+i);
		
	}
	
}
