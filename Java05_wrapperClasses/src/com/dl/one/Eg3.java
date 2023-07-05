package com.dl.one;

public class Eg3 {

	private static final String Integervalue = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive to object
		
		//1.using parameterized constructor
		
		int a = 10;
		System.out.println("Primitive type : " + a);
		
		Integer integer = new Integer(a);
		System.out.println("object type : " + integer);
		
		//2.using value
		
	    Integer b	= Integer.valueOf(a);
		System.out.println("object type : " + b);
		
		//3.auto boxing
		
		Integer c = a;
		System.out.println("object type : " + c);
		
		System.out.println("---------------------");
		
		
		//object to primitive
		
		//1.value()
		
		Integer d = new Integer(200);
		System.out.println("object type : " + d);
		
		int k = d.intValue();
		System.out.println("Primitive type : " + k);
		
		int dd = d;
		System.out.println("Primitive type : " + dd);
		
		System.out.println("---------------------");
		
		
	}

}
