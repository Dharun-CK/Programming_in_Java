package chapter2;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("E:\\myfolder\\Angular and React JS Videos.txt");
			
			FileInputStream fin = new FileInputStream(f);
			
			int byte_value;
			
			while((byte_value = fin.read()) != -1) {
				
				char ch = (char)byte_value;
				
				System.out.print(ch);
			}
			
			
			
			fin.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
