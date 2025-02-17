package com.example;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str1="Apple";
		String str2="ppLea";
		
		
		if(str1.length()==str2.length())
		{
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean val=Arrays.equals(ch1, ch2);
			if(val)
			{
				System.out.println("String is Anagram");
			}
			else
			{
				System.out.println("String isnot Anagram");
			}
			
			
		}
		
		
	}
}
