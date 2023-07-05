package com.dl.three;

public class Profile {
	 
	//this() constructor to invoke current class constructor
	 
	
	public Profile()
	{
		this(10);

		System.out.println("default constructor");
	}
	public Profile(int a)
	{
		this(20,30);
		System.out.println(a);
	}
	public Profile(int a,int b)
	{
		
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		new Profile();
		
	}
}
