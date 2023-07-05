package com.dl.five;

//in some case we don't want to implement all the abstract methods in the interface, then we can implement the expected 
//method in next abstract class and remaining methods in normal class.
  public interface GrandParent {
	void m1();
	void m2();
	void m3();
	void m4();

}
  abstract class Parent implements GrandParent
 {

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}

}
 class child extends Parent
 {

	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method");
		
	}
	 
 }
  class client
 {
	 public static void main(String[] args) 
	 {
		child ch =new child();
		ch.m1();
		ch.m2();
		ch.m3();
		ch.m4();
	 }
 }
