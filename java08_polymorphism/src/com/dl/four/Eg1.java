package com.dl.four;

//method overloading 
//case1: changing no of args
//case2:changing data type of args

class Adder
{
	public double add(double a,double b)
	{
		return a+b;
	}
	
	public float add(float a,float b)
	{
		return a+b;
	}

	
}

public class Eg1 {

	public static void main(String[] args) {
        
		Adder adder = new Adder();
		System.out.println(adder.add(14, 2));
		System.out.println(adder.add(2.2,3.6 ));
		
	}
	

}




