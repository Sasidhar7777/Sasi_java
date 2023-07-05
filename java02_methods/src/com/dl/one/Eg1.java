package com.dl.one;

public class Eg1 {
	
	public static void main (String[] args)
	{
		//Eg1 eg1 = new Eg1();
		add();
		update();
		
		Eg1.add();
		Eg1.update();
	}
	public static void add()
	{
		System.out.println("add method");
	}
	public static void update()
	{
		System.out.println("update method");
	}

}
