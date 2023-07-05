package com.dl.three;

//Hierarchical inheritance

class GrandParent1
{
	public void m1()
	{
		System.out.println("grandparent m1 method");
	}
}
class Parent1 extends GrandParent1
{
	public void m2()
	{
		System.out.println("parent m2 method");
	}
}
class Child1 extends GrandParent1
{
	public void m3()
	{
		System.out.println("child m3 method");
	}
}




public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 child = new Child1();
		child.m1();
		child.m3();
		Parent1 parent = new Parent1();
		parent.m1();
		parent.m2();

	}

}
