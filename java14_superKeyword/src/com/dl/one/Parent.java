package com.dl.one;

//case:1 always refers to the parent class instance variable

public class Parent {
	int a=10;
	int b=20;

}
class child extends Parent
{
	 int a=100;
	int b=200;
	public void operations()
	{
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public static void main(String[] args) {
		child ch =new child();
		ch.operations();
	}
}
