package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arthematic
		
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		a=100;
		b=2000;
		System.out.println(b%a);
		System.out.println(b/a);
		
		System.out.println("__________________");
		
		//assignment
		
		 a=10;
		 b=20;
		
		System.out.println(a+=1);
		System.out.println(a+=b);
		System.out.println(a);
		System.out.println(a-=2);
		System.out.println(a-=b);
		System.out.println(a*=2);
		
		System.out.println("__________________");
		
		//unary operator
		
		a=10;
		b=20;
		
		System.out.println(a++);
		System.out.println(b++);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a);
		System.out.println(++b);
		
		int c=30;
		System.out.println(c++);
		System.out.println(++c);
		System.out.println(c);
		System.out.println("__________________");
		
		//ternary
		
		
		a=10;
		b=(a==1) ? 10:20;
		System.out.println(b);
		b=(a==10) ? 10:20;
		System.out.println(b);
		System.out.println("__________________");
		
		//comparison op
		
		a=10;
		b=20;
		c=10;
		System.out.println(b>a);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(b>=a);
		System.out.println(a==c);
		System.out.println(a!=b);
		System.out.println("__________________");
		
		//logical op
		
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println("__________________");
		
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println("__________________");
		
		//Bitwise Exclusive
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println("__________________");
		
		//Bitwise AND
		System.out.println(true & true);
		System.out.println(false & true);
		System.out.println(true & false);
		System.out.println(false & false);
		System.out.println("__________________");
		
		//Bitwise AND
		System.out.println(true | true);
		System.out.println(false | true);
		System.out.println(true | false);
		System.out.println(false | false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
