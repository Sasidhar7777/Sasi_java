package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive to object
		
		//case1: using parameterised  constuctor
		
		
		int a=10;
		System.out.println( "primitive type : " + a);
		Integer integer = new Integer(a);
		System.out.println("object type : " + integer);
		
		float i=10.0f;
		System.out.println( "primitive type : " +i);
		Float Float = new Float(i);
		System.out.println("object type : " + Float);
		
		
		long j=6304838372l;
		System.out.println( "primitive type : " +j);
		Long k = new Long(j);
		System.out.println("object type : " + k);
		
		System.out.println("-----------------------");
		//case2: using valueof()
		
		int b=10;
		System.out.println( "primitive type : " + b);
		Integer c = Integer.valueOf(b);
		System.out.println("object type : " + c);
		
		System.out.println("-----------------------");
		
		//case3: auto boxing
		
		int d=10;
		System.out.println( "primitive type : " + d);
		Integer auto = d;
		System.out.println( "object type : " + auto);
		
		float e=10.0f;
		System.out.println( "primitive type : " +i);
		Float f = e;
		System.out.println("object type : " + f);
		
		long g=6304838372l;
		System.out.println( "primitive type : " +g);
		Long h = g;
		System.out.println("object type : " + h);
		
		
		
		
		
	}

}
