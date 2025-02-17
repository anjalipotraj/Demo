package com;

public class Duplicate_Element_Array {

	public static void main(String[] args) {
		int a[]= {10,51,3,24,24,3,3,23,23};
		int i,j,len=a.length;
		int k=1;
		int res[]=new int[a.length];

		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				
				if(a[i]==a[j])
				{
					for(k=0;k<=j;k++)
					{
					if(res[k]!=a[j])
					{
					res[k] = a[j];	
				
					}
				}
			}
			}  
		}
		for(i=0;i<res.length;i++)
		{
		System.out.println(res[i]);
		}
	}
	
}
