package com.dl.one;

public class Eg4 {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string to object
		
		//1.using valueof
		
		String s1 = "Sasi";
		System.out.println("string : " + s1);
		String s2 = String.valueOf(s1);
		System.out.println("object : " + s2);
		
		//2.using constructor
		
	String s3	= new String (s1);
	System.out.println("object : " + s3);
	
	System.out.println("---------------------");
	
	
	//object to string
	
	String s4 = new String("300");
	System.out.println("object : " + s4);
	
	//1.to string
	
	String s5 = s4.toString();
	System.out.println("String : " + s5);
	
	//2.using + operator
	
	String s6 =""+s4;
	System.out.println("string : " +  s6);
	
	
		
		
		

	}

}
