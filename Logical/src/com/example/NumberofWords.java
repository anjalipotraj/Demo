package com.example;

import java.util.Scanner;

public class NumberofWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String=");
		String str=sc.nextLine();
		
		String[] words=str.split(" ");
		
		System.out.println("Number of Words="+words.length);
	}
}
