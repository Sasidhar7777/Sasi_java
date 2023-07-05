package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(" ---------");
		for(int i= a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println(" ---------");
		
		//usng for each
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
