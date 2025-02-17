package com.collection;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String args[])
	{
		HashMap<String, Integer> map=new HashMap<>();
		
	map.put("One", 1);
	map.put("Two", 2);
	map.put("three", 3);
	map.put("Four", 4);
	System.out.println(map);
	
	for(String Key:map.keySet()) {
		System.out.println(map.get(Key));
	}
	}
}
