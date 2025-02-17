package com.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList {
	public static void main(String args[]) {
		java.util.ArrayList<Integer> al=new java.util.ArrayList<>();
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(20);
		
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println("===========Ascending Order===============");
		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("==============Dscending Order==================");
		for (Integer val : al) {
			System.out.println(val);
			
		}
		System.out.println("Converting List to Array");
		List<Integer> list=new java.util.ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Object[] arr=list.toArray();
		System.out.println(list);
		System.out.println("===========================================");
		Integer a=new Integer(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(i);
		}
		
		
	}
}
