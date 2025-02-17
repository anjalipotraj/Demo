package com.empmanagement;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> emplist=new ArrayList<>();
		
		emplist.add(new Employee(12, "jiya Bein", 32,"female", "HR", 2013, 25000));
		emplist.add(new Employee(23, "paul nikusi", 25, "male", "sales and marketing", 2015, 13500));
		emplist.add(new Employee(45, "martin", 29, "male", "Infrastructure", 2012, 18000));
		emplist.add(new Employee(34, "murali gowda", 28, "male", "product developement", 2014, 32500));
		emplist.add(new Employee(45, "nima roy", 27, "female", "HR", 2013, 22700));
		emplist.add(new Employee(123, "Iqbal hussen", 43, "male", "security and Transport", 2016, 10500));
		emplist.add(new Employee(134, "Manu sharma", 37, "male", "Accounts and finaanace", 2010, 27000));
		emplist.add(new Employee(34, "liju jacob", 31, "male", "product developement", 2015, 34500));
		emplist.add(new Employee(23, "jyothi reddy", 27, "female", "sales and marketing", 2013, 21500));
		emplist.add(new Employee(123, "jaden Dough", 38, "male", "security and Transport", 2015, 11500));
		emplist.add(new Employee(34, "sanvi pandey", 26, "female", "product developement", 2015, 28900));

		//display all department
		emplist.stream().map(d->d.getDept()).distinct().forEach(System.out::println);
		
		System.out.println("=========================================");
		//display all the names who join before 2015
		emplist.stream().filter(s->s.getDateofjoining()<2015).map(a->a.getName()).forEach(System.out::println);
		
		System.out.println("=============================================");
		//how many males and females in an organization
		Map<String, Long> map=emplist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println("=============================================");
		//Find avg of male and female
		Map<String, Double> m=emplist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(m);
		
		//oldest employee
		System.out.println("=============================================");
		Employee e=emplist.stream().max(Comparator.comparing(Employee::getAge)).get();
		System.out.println(e);
		
		//Youngest employee in product department
		System.out.println("=============================================");
		Employee emp=emplist.stream().filter(d->d.getDept().equalsIgnoreCase("product developement")).min(Comparator.comparing(Employee::getAge)).get();
		System.out.println(emp);
		
		//How many male and female  in sales and marketing
		System.out.println("=============================================");
		Map<String, Long> m1=emplist.stream().filter(d->d.getDept().equalsIgnoreCase("sales and marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(m1);
		
		//Highest paid employee
		System.out.println("=============================================");
		Employee employee = emplist.stream().filter(n->n.getDept()=="HR").max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(employee);
		
		//Average salary of employee
		System.out.println("=============================================");
	Map<String, Double> av=emplist.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
	
	Set<Entry<String, Double>> val=av.entrySet();
	
	for (Entry<String, Double> entry : val) {
		System.out.println(entry.getKey()+"="+entry.getValue());
		
	}
	//System.out.println(av);
			
		
		
		
		
		
		
		
		
		
	}
}
