package chapter2;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			//create file object for locating file
			
			File f = new File("D:\\nandhaclg\\files\\hello.pdf");
			
			//create file output stream object for provide write access to file
			
			FileOutputStream fout = new FileOutputStream(f);
			
			//Prepare content
			
			String msg = "welcome to file output stream";
			
			//convert string into bytes
			
			byte[] by = msg.getBytes();
			
			//write byte array into file output stream object
			
			fout.write(by);
			
			//close connection
			
			fout.close();
			
			System.out.println("Success...");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
