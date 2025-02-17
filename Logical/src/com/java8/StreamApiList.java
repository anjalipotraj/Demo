package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiList {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,6,8,3,89,544,43,6,67,34,23);
		
//		list.stream().filter(n->n%2==0).forEach(System.out::println);
//		
//		System.out.println(list.stream().count());
		
		list.stream().skip(6).forEach(System.out::println);
	}
}
