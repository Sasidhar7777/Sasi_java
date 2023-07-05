package com.dl.two;

public class client {
	//this keyword to invoke current class method
	
	public void add()
	{
		//this.update();
		//this.delete();
		System.out.println("add method");
	}
	public void update()
	{
		//this.delete();
		System.out.println("update method");
	}
	public void delete()
	{
		this.add();
		this.update();
		System.out.println("delete method");
	}

	public static void main(String[] args) {
		
		client cl = new client();
		cl.delete();
		
		
	}

}
