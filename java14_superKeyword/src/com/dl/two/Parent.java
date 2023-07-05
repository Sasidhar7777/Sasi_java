package com.dl.two;
//super keyword always refer to the parent class method
public class Parent {
	public void m1()
	{
		System.out.println("m1 method parent");
	}
	public void m2()
	{
		System.out.println("m2 method parent");
	}

}
class child extends Parent
{
	public void m1()
	{
		System.out.println("m1 method child");
	}
	public void m3()
	{
		this.m1();
		super.m1();
		super.m2();
	}
	public static void main(String[] args) {
		child ch = new child();
		ch.m3();
	}
}
