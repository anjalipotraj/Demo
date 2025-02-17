package com.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String str="java";
		//char ch[]=str.toCharArray();
		int count=0;
		Map<Character, Integer> map=new HashMap<>();
		 for(int i=0;i<str.length();i++)
		 {
			 if(map.containsKey(str.charAt(i)))
			 {
				 map.put(str.charAt(i), count++);
				 
				 
			 }
			 System.out.println(str.charAt(i)+" ="+count);
		 }
		
	}
	
}
