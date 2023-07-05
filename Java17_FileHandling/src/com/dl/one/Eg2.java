package com.dl.one;

import java.io.File;

public class Eg2 {

	public static void main(String[] args) {
		File f1 = new File("spring");
		boolean dir = f1.mkdir();
		System.out.println(dir);
		
		File f2 = new File("corejava\\advancejava\\spring");
		boolean dir1 = f2.mkdirs();
		System.out.println(dir1);
	}

}
