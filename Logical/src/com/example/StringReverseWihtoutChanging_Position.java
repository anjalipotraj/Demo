package com.example;

public class StringReverseWihtoutChanging_Position {

	public static void main(String[] args) {
		
	String str="Hello this is Anjali";

	String str2[]=str.split("\\s");
	String totalstr="";
	for (String words : str2) {
		String rev="";
		for(int i=words.length()-1;i>=0;i--)
		{
			rev=rev+words.charAt(i);
		}
//		System.out.print(rev);
//		System.out.print(" ");
		totalstr=totalstr+rev+" ";
		
	}
	System.out.println(totalstr);

	
	}
}
