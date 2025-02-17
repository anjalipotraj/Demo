package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		
	List<Student> list=new ArrayList<>();
	list.add(new Student(1, "Anjali", 76.56));
	list.add(new Student(2, "Pooja", 70.6));
	list.add(new Student(11, "Kasuri", 67.56));
	list.add(new Student(12, "Sonu", 89.6));
	list.add(new Student(5, "Sanshu", 72.56));

	Collections.sort(list);
	System.out.println(list);
	
	}
}
