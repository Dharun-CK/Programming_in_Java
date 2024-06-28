package chapter2;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("D:\\nandhaclg\\files\\buffer2.txt");
			
			FileWriter fw = new FileWriter(f);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			String msg = "Welcome to buffered writer";
			
			bw.write(msg);
			
			bw.close();
			
			fw.close();
			
			System.out.println("Success ...");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
