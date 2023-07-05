package com.dl.six;

class P1
{
	public void m1()
	{
		System.out.println("m1 method");
	}
}
abstract class P2 extends P1
{
	public void m2()
	{
		System.out.println("m2 method");
	}
}
class P3 extends P2
{
	public void m3()
	{
		System.out.println("m3 method");
	}
}

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3 p3 =  new P3();
		p3.m1();
		p3.m2();
		p3.m3();

	}

}
