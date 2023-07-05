package com.dl.one;


import java.io.FileOutputStream;
import java.io.IOException;

public class Eg4 {

	public static void main(String[] args) throws IOException  {
		//FileOutputStream()
		FileOutputStream f1 = new FileOutputStream("one.txt");
		String s1 = "My Name is Bodasingi sasidhar";
		byte[] b =s1.getBytes();
		f1.write(b);
		System.out.println("file created and data entered");
		f1.close();
		
				

	}

}
