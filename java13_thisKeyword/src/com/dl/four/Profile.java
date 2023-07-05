package com.dl.four;

//using this keyword as method parameter

public class Profile {
	public void add(Profile p)
	{
		System.out.println("add method");
	}
	public void update(Profile p)
	{
		System.out.println("update method");
	}
	public void delete(Profile p)
	{
		System.out.println("delete method");
	}
	void get() 
	{
		add(this);
		update(this);
		delete(this);
		
	}
	public static void main(String[] args) {
		Profile p = new Profile();
		p.get();
		
	}

}
