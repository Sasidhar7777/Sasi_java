package com.dl.three;

public class Eg7 {

	public static void main(String[] args) {
		// split()
		String s1 = "Java Python JavaScript";
		String[] sp = s1.split(" ");
		for(String a : sp)
		{
			//System.out.println(a);
		}
		String s2 = "Java:Python:JavaScript";
		String[] sp1 = s2.split(":");
		for(String a : sp1)
		{
			//System.out.println(a);
		}
		String s3 = "Java and Python and JavaScript";
		String[] sp2 = s3.split("and", 2);
		for(String a : sp2)
		{
			System.out.println(a);
		}
		
				
	}

}
