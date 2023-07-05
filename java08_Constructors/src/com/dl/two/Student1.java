package com.dl.two;

public class Student1 {
	int id;
	String name;
	
	public Student1(int i, String n)
	{
		 id = i;
		 name = n;
	}
	public void display()
	{
		
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {
		
		Student1 s1 = new Student1(111,"sasi");
		s1.display();
		
		Student1 s2 = new Student1(222,"sasidhar");
		s2.display();
		
	}

}
