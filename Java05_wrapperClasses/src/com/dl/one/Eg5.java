package com.dl.one;

public class Eg5 {
	
	public static void main(String[] args)
	{
		//primitive to string
		//1.toString
		int i = 400;
		System.out.println("primitive : " + i);
		 String s1=Integer.toString(i);
		 System.out.println("String : " + s1);
		 
		 //using + opeartor 
		 String s2 = ""+i;
		 System.out.println("String : " + s2);
		 System.out.println("----------------");
		 
		 //string to primitive
		 
		 //using parse
		 
		 String s3 ="500";
		 System.out.println("String : " + s3);
		 int k = Integer.parseInt(s3);
		 System.out.println("primitive : " + k);
		 String s4 = "9848761248";
		 System.out.println("String : " + s4);
		 long j = Long.parseLong(s4);
		 System.out.println("primitive : " + j);
		 
		
	}

}
