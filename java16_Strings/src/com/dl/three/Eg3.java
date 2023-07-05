package com.dl.three;

public class Eg3 {

	public static void main(String[] args) {
		// Startswith()

		String s1 = new String("Java and Python");
		System.out.println(s1.startsWith("Java and"));//true
		System.out.println(s1.startsWith("Ja"));
		
		//endswith()

		System.out.println(s1.endsWith("Python"));//true
		System.out.println(s1.endsWith("on"));//true
		System.out.println(s1.endsWith("Java"));//true
		
		//contains()
		
		System.out.println(s1.contains("an"));
		System.out.println(s1.contains("ava a"));//true
	}

}
