package com.dl.four;

 interface Grandparent {
	
	public abstract void m1();
	void m2();
	

}
 interface parent 
 {
	 void m3();
	 void m4();
 }
 class child implements Grandparent,parent
 {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 method");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		parent p = new child();
		p.m3();
		p.m4();
		Grandparent gp = new child();
		gp.m1();
		gp.m2();
	}
	 
 }
