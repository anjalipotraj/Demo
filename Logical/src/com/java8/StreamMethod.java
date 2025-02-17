package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethod {

	public static void main(String[] args) {
		
		int a[]={2,4,3,5,6,8,6,5,5,7,4,2,1,4,4,3,2,4,7,8,7,9,0};
		
//		Arrays.stream(a).filter(n->n%2==0).forEach(System.out::println);
//		
//		System.out.println("====================================");
//		
//		long l= Arrays.stream(a).distinct().count();
//		System.out.println(l);
//		
//		System.out.println("=======Using Set=============");
//		Set<Integer> set=new HashSet<>();
//		Arrays.stream(a).filter(n->set.add(n)).forEach(System.out::println);
//		
//		System.out.println("==========Map Method===========");
//		Arrays.asList(2,3,5,7,9).stream().map(n->n*n*n).forEach(System.out::println);
//		
//		String name[]= {"pooja","kasturi","anjali"};
//		Arrays.asList(name).stream().map(String::toUpperCase).forEach(System.out::println);
//		
//		System.out.println(Arrays.stream(a).min().getAsInt());
//		
		//Sorted
		System.out.println("Sorted List");
		Arrays.asList(23,45,22,56,7,76,90,48).stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		//collectors
		System.out.println("Using Collectors");
		List<Integer> ls=Arrays.asList(21,34,56,45,78,999,99).stream().sorted().collect(Collectors.toList());
		System.out.println(ls);
		
		//anymatch
		List<String>list=Arrays.asList("anjali","pooja","kasturi","sanshu","sonu");
		if(list.stream().anyMatch((String s)->s.length()>5))
		{
			System.out.println("Yes Present");
		}
	
		Optional<String> fn=list.stream().findFirst();
		System.out.println(fn.get());
		
	}
}
