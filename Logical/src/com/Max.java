package com;

import java.util.Iterator;
import java.util.Scanner;

public class Max {
	
	public static void main(String[] args) {
		
	
	int []a=new int[5];
	int i,j=0,max;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 Integer");
	for(i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		
		}
	max=a[0];
	for(i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		
		
	}
	System.out.println("The Max Element="+max);
		
	}

}
