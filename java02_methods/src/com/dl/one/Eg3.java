package com.dl.one;

public class Eg3 {
	
	String  UserName = "Sasi";
	String Contact = "9654985223";
    static String address = "Vzm";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "main method :" + new Eg3().UserName);
		System.out.println("main method : " + new Eg3().Contact);
		System.out.println("main method : " + address);
		
		Eg3 eg3 = new Eg3();
		eg3.getUserDetails();
		
		getUserDetailsTwo();

	}
	
	public void getUserDetails()
	{
		System.out.println("instance mathod : " + UserName);
		System.out.println("instance method : " + Contact);
		System.out.println("instance method : " + address);
		
	}
	
	public static void getUserDetailsTwo() 
	{
		System.out.println("static mathod : " + new Eg3().UserName);
		System.out.println("static mathod : " + new Eg3().Contact);
		System.out.println("static mathod : " + address);
	}

}
