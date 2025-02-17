package com.practiceprogram;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("Enter Array Element=");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<5;i++) {
			if(a[i]>max)
				{
					max= a[i];
				}
			}
		System.out.println("Max Element="+max);
		
	}
}
