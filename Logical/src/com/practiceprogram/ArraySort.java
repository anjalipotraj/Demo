package com.practiceprogram;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter No.  of Element=");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Element=");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		sort(a,n);
		
	}

	public static void sort(int[] a, int n) {
		// TODO Auto-generated method stub
		
		int i, j, temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("After Sorting Array");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
