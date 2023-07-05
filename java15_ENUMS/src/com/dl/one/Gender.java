package com.dl.one;

public enum Gender {
	
	MALE,
	FEMALE

}
 class Client
{
	public static void main(String[] args ) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		Gender g = Gender.valueOf("MALE");
		System.out.println(g);
		
		//wrapper classes
		System.out.println(Integer.MAX_VALUE +" "+ Integer.MIN_VALUE);
		System.out.println(Integer.BYTES+ " "+ Integer.SIZE);
	}
}