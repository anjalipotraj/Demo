package com;

import java.util.Scanner;

public class MinMaxExample {
	static int min(int a[],int size)
	{
		int min=a[0];
		for(int i=0;i<size;i++) {
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	
	static int max(int a[],int size)
	{
		int max=a[0];
		for(int i=0;i<size;i++) {
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter Array Size=");
		size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter Array of Elements=");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=min(a,size);
		System.out.println("Miimun Element of an Array is="+m);
		int mx=max(a,size);
		System.out.println("Maximum Element of an Array is="+mx);
		
	}

}

