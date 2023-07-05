package com.dl.three;

public class Eg5 {

	public static void main(String[] args) {
		// toCharArray()
		
		String s1 = new String("hello Java and hello Python");
		 char[] s2 = s1.toCharArray();
		 s2[0] = 'H';
		 System.out.println(s2);
		 System.out.println(s1);
		 
		 //charAt(0)
		 
		 String s3 = new String("programming") ;
		 
		 System.out.println(s3.charAt(20));

	}

}
