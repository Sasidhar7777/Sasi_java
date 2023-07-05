package com.dl.three;

public class Eg2 {

	public static void main(String[] args) {
		
		//compareto()
		String s1 = new String("A");
		String s2 = new String("B");
		String s3 = new String("A");
		System.out.println(s1.compareTo(s2));//-1
		System.out.println(s1.compareTo(s3));//0
		System.out.println(s2.compareTo(s3));//1
		
		String s4 = new String("A");
		String s5 = new String("a");
		System.out.println(s4.compareTo(s5));
		
		//comparetoIgnorancecase()
		
		System.out.println(s4.compareToIgnoreCase(s5));
	}

}
