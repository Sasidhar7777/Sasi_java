package com.dl.one;

 abstract class Parent {
	//abstract method
	abstract void m1();
	//non abstract method
	void m2()
	{
		System.out.println("non abstarct method");
	}
}
 class child extends Parent
{

	@Override
	void m1() {
		System.out.println("abstarct method");
		
	}

 
  
	public static void main(String[] args) {
		//Parent parent = new child();
		//parent.m1();
		//parent.m2();
		child c1 = new child();
		c1.m1();
		c1.m2();
		
	}
 }
	

