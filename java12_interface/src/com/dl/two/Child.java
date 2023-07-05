package com.dl.two;

public  class Child implements Parent {
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
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();
		p.m1();
		p.m2();
		p.m3();

	}

	

}
