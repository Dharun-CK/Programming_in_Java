package chapter2;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("E:\\myfolder\\customtagxml.txt");
			
			FileReader fr = new FileReader(f);
			
			int x;
			
			while((x=fr.read())!=-1) {
				
				char ch = (char)x;
				
				System.out.print(ch);
			}
			
			fr.close();
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
