package com.dl.three;

public class Eg4 {

	public static void main(String[] args) {
		// replace(0,0)

		String s1 = new String("Java");
		System.out.println(s1.replace("J","j"));//java
		System.out.println(s1.replace("Java", "Python"));
		String s2 = new String("Java Programming and Python Programming");
		System.out.println(s2.replace("Pro", "bro"));
		
		//replaceAll(0,0)
		
		System.out.println(s2.replaceAll("mm", "MM"));
		//replaceFirst(0,0)
		System.out.println(s2.replaceFirst("Pro","pro" ));
		
	
	}

}