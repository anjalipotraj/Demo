package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(102);
		list.add(201);
		list.add(311);
		list.add(720);
		list.add(211);
		list.add(102);
		list.add(null);

		System.out.println(list);
		//System.out.println(list.get(2));
		list.set(4, 500);
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
	
}
