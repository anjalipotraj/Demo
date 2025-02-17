package com.empmanagement;

public class Employee {

 private int id;
 
 private String name;
 
 private int age;
 
 private String gender;
 
 private String dept;
 
 private int dateofjoining;
 
 private long salary;

public Employee(int id, String name, int age, String gender, String dept, int dateofjoining, long salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.dept = dept;
	this.dateofjoining = dateofjoining;
	this.salary = salary;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getGender() {
	return gender;
}

public String getDept() {
	return dept;
}

public int getDateofjoining() {
	return dateofjoining;
}

public long getSalary() {
	return salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
			+ ", dateofjoining=" + dateofjoining + ", salary=" + salary + "]";
}
 
}
