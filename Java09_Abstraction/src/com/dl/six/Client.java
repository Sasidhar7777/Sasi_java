package com.dl.six;
abstract class parent
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
}
abstract class Child extends parent
{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}

}
  class children extends Child
{

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}

	@Override
	void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 method");
	}
	
}

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		children ch = new children();
		ch.m1();
		ch.m2();
		ch.m3();
		ch.m4();

	}

}
