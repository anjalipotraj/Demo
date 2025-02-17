package com;

import java.util.Scanner;

public class Sort {


	public static void main(String[] args) {
		
	
	int []a=new int[5];
	int i,j,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 Integer");
	for(i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		
		}

	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
		if(a[i]<a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		
	}
	for(i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
	}

}
