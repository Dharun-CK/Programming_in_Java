package chapter2;

import java.io.*;

public class FilterInputStreamDemo {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("E:\\myfolder\\audiofiles.txt");
			
			FileInputStream fin = new FileInputStream(f);
			
			FilterInputStream flt = new FilterInputStream(fin) { };
			
			int x;
			
			while((x=flt.read())!=-1) {
				
				char ch = (char)x;
				
				System.out.print(ch);
			}
			
			flt.close();
			
			fin.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
