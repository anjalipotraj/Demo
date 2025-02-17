package com;

import java.util.Scanner;

public class CountCommonElement {

	static int count(int a[],int b[],int N)
	{
		int ans=0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(a[i]==b[j]) {
					ans++;
				}
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[] = { 2, 4, 5, 8, 12, 13, 17,18, 20, 22, 309, 999 };
		int b[] = { 109, 99, 68, 54, 22, 19,17, 13, 11, 5, 3, 1 };
		int N=a.length;
		
		int ans=count(a,b,N);
		System.out.println("Common element in Both Array is="+ans);
		
	}
}
