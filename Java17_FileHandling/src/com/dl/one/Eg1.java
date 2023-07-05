package com.dl.one;

import java.io.File;
import java.io.IOException;

public class Eg1 {

	public static void main(String[] args)  {
		File f1 = new File("cat.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file1 created");
		File f2 = new File("src\\bat.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file2 created");
		File f3 = new File("C:\\Users\\sasi\\Documents\\jawa\\f3");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file3 created");
		
		
	}

}
