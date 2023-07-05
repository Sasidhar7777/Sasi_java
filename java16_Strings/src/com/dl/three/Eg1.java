package com.dl.three;

public class Eg1 {

	public static void main(String[] args) {
		// sequence of characters
		//created by two ways 1.literals 2.using new keyword
		
		String s1 = "java";
		System.out.println(s1);//one object created at SCP(string constant pool)
		
		//using new keyword
		
		String s2 = new String("java");
		System.out.println(s2);//two objects created at SCP and heap area
		
		String s3= "java";
		System.out.println(s3);
		
		String s4 = new String("java");
		System.out.println(s4);
		
		//==(reference check)
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);//extra copy
		
		//equals()(content check)
		
		System.out.println(s1.equals(s4));
		
		
		
		

	}

}
