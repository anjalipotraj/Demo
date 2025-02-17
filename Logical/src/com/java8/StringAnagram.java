package com.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringAnagram {

	public static void main(String[] args) {
		
		String str1="applE";
		String str2="Pplaei";
		
		String resstr1=Arrays.stream(str1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		
		String resstr2=Arrays.stream(str2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		
		String result=resstr1.equals(resstr2)?"Anagram String":"Not Anagram String";
		System.out.println(result);
		
		//Each word reverse
		String str3="Hi this is Anjali";
		
		String revword= Arrays.stream(str3.split(" ")).map(words->new StringBuffer(words).reverse()).collect(Collectors.joining(" "));
		System.out.println(revword);
		
	}
	
}
