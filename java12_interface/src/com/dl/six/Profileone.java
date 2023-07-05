package com.dl.six;

//in java for normal classes we cannot extend multiple classes at a time.
//so there is no multiple inheritance but it is possible through interface

public interface Profileone {
	void m1();
	void m2();

}
interface Profiletwo
{
	void m3();
	void m4();
}
interface Profilethree extends Profileone,Profiletwo
{
	void m5();
	void m6();
}
class client implements Profilethree
{

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method");
		
	}

	@Override
	public void m5() {
		System.out.println("m5 method");
	}

	@Override
	public void m6() {
		System.out.println("m6 method");
		
	}
	public static void main(String[] args) {
		Profilethree ch = new client();
		
		
		ch.m1();
		ch.m2();
		ch.m3();
		ch.m4();
		ch.m5();
		ch.m6();
	}
	
}