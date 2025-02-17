package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class Vowel_Frequence {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String=");
		String str=sc.next();
		char ch[]=str.toCharArray();
		int count[]=new int[5];
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='A')
			{
				count[0]++;
			}
			else if(ch[i]=='e'||ch[i]=='E')
			{
				count[1]++;
			}
			else if(ch[i]=='i'||ch[i]=='I')
			{
				count[2]++;
			}
			else if(ch[i]=='o'||ch[i]=='O')
			{
				count[3]++;
			}
			else if(ch[i]=='u'||ch[i]=='U')
			{
				count[4]++;
			}
				
		}
		
		System.out.println("Count of a="+count[0]);
		System.out.println("Count of e="+count[1]);
		System.out.println("Count of i="+count[2]);
		System.out.println("Count of o="+count[3]);
		System.out.println("Count of u="+count[4]);
		
		System.out.println("=============================================");
		
		String str2="Anjali potraj";
		char chr[]=str2.toCharArray();
		HashMap<String, Integer> map=new HashMap<>();
		map.put("a", 0);
		map.put("e", 0);
		map.put("i", 0);
		map.put("o", 0);
		map.put("u", 0);
		
		for(int j=0;j<str2.length();j++)
		{
			if(chr[j]=='A'||chr[j]=='a')
			{
				map.put("a",map.get("a")+1);
			}
			else if(chr[j]=='E'||chr[j]=='e')
			{
				map.put("e",map.get("e")+1);
			}
			else if(chr[j]=='i'||chr[j]=='I')
			{
				map.put("i", map.get("i")+1);
			}
			else if(chr[j]=='o'||chr[j]=='O')
			{
				map.put("o", map.get("o")+1);
			}
			else if(chr[j]=='u'||chr[j]=='U')
			{
				map.put("u", map.get("u")+1);
			}
		}
		
		System.out.println("Count of a="+map.get("a"));
		System.out.println("Count of e="+map.get("e"));
		System.out.println("Count of i="+map.get("i"));
		System.out.println("Count of o="+map.get("o"));
		System.out.println("Count of u="+map.get("u"));
		
		
	}
}
