package com.dl.one;

public class Eg4 {
	
	public static void main (String[] args)
	{
		new Eg4().m1();
		m2();
		System.out.println(new Eg4().m3());
		System.out.println(new Eg4().sendRequest());
	}
	public void m1()
	{
		System.out.println("Instance method");
	}
	public static void m2()
	{
		System.out.println("static method");
	}
	public int m3()
	{
		return 0;
	}
	public String sendRequest()
	{
		return "http request sent";
	}

}