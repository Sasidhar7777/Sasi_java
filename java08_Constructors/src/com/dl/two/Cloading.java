package com.dl.two;

public class Cloading {
	
	 Cloading()
	{
		System.out.println("default constuctor");
	}
	 Cloading(int i)
	 {
		System.out.println(i); 
	 }
	 Cloading(int i ,int j)
	 {
		 System.out.print(i);
		 System.out.println(j);
	 }
	 Cloading(int i,int j,int k)
	 {
		 System.out.print(i);
		 System.out.print(j);
		 System.out.print(k);
	 }
	public static void main(String[] args) {
		new Cloading();
		new Cloading(1);
		new Cloading(1,2);
		new Cloading(1,2,3);
		
	}

}
