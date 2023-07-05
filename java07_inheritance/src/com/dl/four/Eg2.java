package com.dl.four;

//multi level inheritance

class grandparent
{
	public void m1()
	{
		System.out.println("grandparent m1 method");
	}
}
class parent extends grandparent
{
	public void m2()
	{
		System.out.println("parent m2 method");
	}
}
class Child extends parent
{
	public void m3()
	{
		System.out.println("child m3 method");
	}
}

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();

	}

}
