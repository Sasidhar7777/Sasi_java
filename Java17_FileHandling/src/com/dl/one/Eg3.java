package com.dl.one;

import java.io.FileWriter;
import java.io.IOException;

public class Eg3 {

	//using FileWriter()

	public static void main(String[] args) throws IOException  {
		FileWriter writer = new FileWriter("one.txt");
		String s1 = "Hello Java and Python and core java and andvance java";
		writer.write(s1);
		System.out.println("data entered");
		writer.close();
		
		
		

	}

}
