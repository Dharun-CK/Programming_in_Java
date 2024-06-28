package chapter2;

import java.io.*;

public class ReadAndWriteData {

	public static void main(String[] args) {
		
		try {
			
			File source = new File("E:\\myfolder\\samplevideo.mp4");
			
			File destination = new File("D:\\nandhaclg\\files\\sample1.mp4");
			
			FileInputStream fin = new FileInputStream(source);
			
			FileOutputStream fout = new FileOutputStream(destination);
			
			int x;
			
			while((x=fin.read())!=-1) {
				
				fout.write(x);
			}
			
			fout.close();
			
			fin.close();
			
			System.out.println("Success...");
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
