package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer, String>map=new HashMap<>();
		
		map.put(1, "Anjali");
		map.put(2, "Pooja");
		map.put(3, "Kasturi");
		map.put(4, "Sanshu");
		map.put(5, "Sonu");
		
		System.out.println(map);
		
		Iterator<Map.Entry<Integer, String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> keys=itr.next();
			
			System.out.println(keys.getKey()+"="+keys.getValue());
		}
	}
}
