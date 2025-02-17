package com.example;

public class Index_Of_Char {

	
	public static void main(String[] args) {
		
		String str="Hello";
		boolean flag=false;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='o')
			{
				flag=true;
				System.out.println("Index of Char="+i);
			}
		}
		
	}
}
