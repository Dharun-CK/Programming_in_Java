package chapter2;

import java.io.*;

public class WriteCSVData {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("D:\\nandhaclg\\files\\library.csv");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			String msg = "Lib ID , Lib Name , Total Books\n"
					+ "lib-1,abc,100\n"
					+ "lib-2,def,300\n";
			
			byte[] by = msg.getBytes();
			
			fout.write(by);
			
			fout.close();
			
			System.out.println("Success...");
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
