package chapter2;

import java.io.File;

public class RenamingFile {

	public static void main(String[] args) {
		
		java.io.File f1 = new java.io.File("D:\\nandhaclg\\files\\student.xlsx");
		
		java.io.File f2 = new java.io.File("D:\\nandhaclg\\files\\Student Information.xlsx");
		
		f1.renameTo(f2);
		
		System.out.println("Success...");
	}
}
