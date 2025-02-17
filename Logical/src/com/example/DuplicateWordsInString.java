package com.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String inputstr;
		System.out.println("Enter String=");
		inputstr=sc.nextLine();
		duplicateWord(inputstr);
		
	}
	public static void duplicateWord(String inputstr)
	{
		String[] words=inputstr.split(" ");
		HashMap<String, Integer> wordcount=new HashMap<>();
		
		for (String word : words) {
			if(wordcount.containsKey(word.toLowerCase()))
					{
				wordcount.put(word.toLowerCase(),wordcount.get(word.toLowerCase())+1);
					}
			else
			{
				wordcount.put(word.toLowerCase(), 1);
			}
			
		}
		
		Set<String> wordsInstring=wordcount.keySet();
		for (String word : wordsInstring) {
			
			if(wordcount.get(word)>1) {
				System.out.println(word+" : "+wordcount.get(word));
			}
			
		}
	}
	
}
