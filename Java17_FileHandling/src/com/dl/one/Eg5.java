package com.dl.one;


import java.io.FileReader;
import java.io.IOException;

public class Eg5 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("one.txt");
		char[] ch = new char[100];
		reader.read(ch);
		System.out.println(ch);
		reader.close();
		
		
		

	}

}
