package com.dl.three;

public class Eg3_child extends Eg3 {
	
	 void m2()
		{
			System.out.println("m2 method");
		}
	public static void main(String[] args) {
		
		new Eg3_child().m2();
		new Eg3_child().m1();
	}

}
