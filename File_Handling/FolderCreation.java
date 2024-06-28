package chapter2;

import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {
		
		java.io.File f = new java.io.File("D:\\nandhaclg\\files\\sample\\");
		
		f.mkdirs(); //make directories
		
		System.out.println("Success...");
	}
}
