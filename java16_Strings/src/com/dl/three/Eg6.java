package com.dl.three;

public class Eg6 {

	public static void main(String[] args) {
		// indexOf() and indexOf(a,b)
		String s1 = new String ("I Like Java and I Like Python and I Like JavaScript");
		System.out.println(s1.indexOf("Like"));
		System.out.println(s1.indexOf("Like",5));
		//lastIndexOf()
		System.out.println(s1.lastIndexOf("Like"));
		
		//toUpperCase() and toLowerCase()
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		}

}
