package com.dl.two;

enum color
{
	RED,
	WHITE,
	GREEN,
	BLACK
}

public class Client {

	public static void main(String[] args) {
		//using valueof() .returns a  object of color with given constant
		color cl = color.valueOf("GREEN");
		//System.out.println(cl);
		
		//using values[]

		color value[] = color.values();
		for(color c : value)
		{
			System.out.println(c);
			System.out.println(c.ordinal());
		}
	}

}
