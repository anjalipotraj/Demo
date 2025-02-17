package com.practiceprogram;

import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str;
		int count=0;
		System.out.println("Enter Words=");
		str=sc.next();
		for (String word : str.split(" ")) {
			count++;
		}
		System.out.println("No of word="+count);
	}
}
