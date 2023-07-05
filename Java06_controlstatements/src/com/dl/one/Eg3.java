package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String address = "Delhi,India";
		
		if(address.endsWith("India"))
		{
			if(address.contains("Noida"))
			{
				System.out.println("your city is Noida");
			}
			else if(address.contains("Meerut"))
			{
				System.out.println(" your city is meerut");
			}
			else
			{
				System.out.println(address.split(",")[0]);
			}
		}
		else
		{
			System.out.println("your not living in india");
		}

	}

}
