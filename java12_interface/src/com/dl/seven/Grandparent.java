package com.dl.seven;

public interface Grandparent {
	void m1();
	void m2();

}
abstract class parent
{
	abstract void m3();
	abstract  void m4();
}
class child extends parent implements Grandparent
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
	void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	void m4() {
		System.out.println("m4 method");
		
	}
	public static void main(String[] args) {
		Grandparent gp = new child();
		gp.m1();
		gp.m2();
		parent p = new child();
		p.m3();
		p.m4();
	}
	
}