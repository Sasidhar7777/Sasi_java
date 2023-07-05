package com.dl.three;

//single level inheritance

class Parent
{
	public void add()
	{
		System.out.println( "add()method instance method ");
	}
    public static void put()
	{
		System.out.println("put()method static method");
	}
	 
		
	
}
class child extends Parent
{
	public int add(int a,int b)
	{
		return a+b;
	}
public static void main (String[] args)
{
	child Child = new child();
	System.out.println(Child.add(100, 200));
	Child.add();
	put();
	
}
}

	




	
		
		
	
	


