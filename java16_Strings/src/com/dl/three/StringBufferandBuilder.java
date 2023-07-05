package com.dl.three;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = s1.concat("Python");
		//System.out.println(s2);
		//System.out.println(s1.equals(s2));
		
		
		StringBuffer s3 = new StringBuffer("Java");
		StringBuffer s4 = s3.append("Python");
		System.out.println(s4);
		System.out.println(s3);
		//System.out.println(s3.equals(s4));
		StringBuffer s5 = s3.reverse();
		System.out.println(s5);
		s4.insert(4,"and");
		System.out.println(s4);
		
		
		StringBuilder s6 =new StringBuilder("java");
		StringBuilder s7 = s6.append(" Python");
		System.out.println(s7);
		
		
		
		

	}

}
