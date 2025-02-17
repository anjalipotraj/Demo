package com;

import java.util.Scanner;

public class ReverseArray {
	
	static void reverse(int a[],int N)
	{
		System.out.println("Array in Reverse Order=");
		for(int i=N-1;i>=0;i--)
			{
			System.out.println(a[i]);
			}
	}
	static void tempRev(int a[],int N)
	{
		int temp[]=new int[N];
		for(int i=0;i<N;i++)
		{
			temp[i]=a[N-i-1];
		}
		System.out.println("Array element in Reverse order using temp array");
		for(int i=0;i<N;i++)
		{
			System.out.println(temp[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=5;
		int a[]=new int[N];
		System.out.println("Enter Array Elements=");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		//reverse(a, N);
		System.out.println("=================================================");
		tempRev(a, N);
		
	}
	

}
