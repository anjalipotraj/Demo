package com.practiceprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OddNumberInList {
	public static void Odd(List<Integer> l)
	{
		System.out.println("Odd numbers in List");
		for (Integer list : l) {
			if(list%2!=0)
				System.out.println(list);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many numbers adding in list");
		int m,n;
		m=sc.nextInt();
		System.out.println("=========================================");
		for(int i=0;i<m;i++)
		{
			 n=sc.nextInt();
			list.add(i);
		}
		Odd(list);
	}

}
