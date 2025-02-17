package com.collection;

public class Student implements Comparable<Student> {

	private int id;
	
	private String name;
	
	private double per;

	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPer() {
		return per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.id-s.id;
	}
	
}
