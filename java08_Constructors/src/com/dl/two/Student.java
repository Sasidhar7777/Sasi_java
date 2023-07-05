package com.dl.two;

public class Student {
	
	int id;
	String name;
	
	public  void display()
	{
		System.out.println("student : " + id);
		System.out.println("student name : " + name);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student();
		s2.display();
		
	}
	
	

}
