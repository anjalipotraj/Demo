package com.example;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String=");
		String str=sc.nextLine();
		String newstr=str.replaceAll("\\s+", "");
		System.out.println("After removing White spaces="+newstr);
	}
}
