package com.example;

public class CharacterCount {

	public static void main(String[] args) {
		String str="Hello Exponent";
		char s[]=str.toCharArray();
		int count=0;
		System.out.println("Character count With Space");
		for(int i=0;i<=s.length-1;i++)
		{
			count++;
		}
		
		System.out.println("Total charactor="+count);
		System.out.println("Character count Without Space");
		int cnt=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=' ')
			{
				cnt++;
			}
		}
		System.out.println("Total charactor="+cnt);

	}
}
