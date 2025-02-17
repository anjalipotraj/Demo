package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<Integer>  set=new HashSet<>();
		set.add(23);
		set.add(34);
		set.add(45);
		set.add(89);
		set.add(23);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		Iterator<Integer> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("====================================");
		for (Integer value : set) {
			System.out.println(value);
		}
	}
}
