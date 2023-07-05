package com.dl.five;

 abstract class Bro {
	 
	 Bro()
	 {
		 System.out.println("default bro");
	 }
 }
class Bro1 extends Bro
{
	Bro1()
	{
		System.out.println("default bro1");
	}
}
 class client
{
	public static void main(String[] args) {
		
		new Bro1();
	}
}
	

