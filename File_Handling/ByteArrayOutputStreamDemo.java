package chapter2;

import java.io.*;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			String msg = "Byte Array output stream";
			
			byte[] by = msg.getBytes();
			
			ByteArrayOutputStream bis = new ByteArrayOutputStream();
			
			bis.write(by);
			
			
			File f1 = new File("D:\\nandhaclg\\files\\byte1.txt");
			
			File f2 = new File("D:\\nandhaclg\\files\\byte2.doc");
			
			FileOutputStream fout1 = new FileOutputStream(f1);
			
			FileOutputStream fout2 = new FileOutputStream(f2);
			
			bis.writeTo(fout1);
			
			bis.writeTo(fout2);
			
			
			bis.close();
			
			fout1.close();
			
			fout2.close();
			
			System.out.println("Success");
			
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
