package com.dl.three;

//use of super keyword with constructor

public class Parent {
	Parent()
	{
		System.out.println("parent default cons");
	}
	Parent(int a)
	{
		System.out.println("parent one args cons : " + a);
	}

}
class child extends Parent
{
	child()
	{
		this(10);
		
		System.out.println("child default cons");
	}
	child(int a)
	{
		super(100);
		System.out.println("child one args cons : " + a);
	}
	child(int a,int b)
	{
		super();
	}
	public static void main(String[] args) {
	   new	child();
	  new child(10,20);
	}
}
