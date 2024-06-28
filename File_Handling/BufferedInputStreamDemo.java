package chapter2;

import java.io.*;

public class BufferedInputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("E:\\myfolder\\attachpythonlib.txt");
			
			FileInputStream fin = new FileInputStream(f);
			
			BufferedInputStream bis = new BufferedInputStream(fin);
			
			int x;
			
			while((x=bis.read())!=-1) {
				
				char ch = (char)x;
				
				System.out.print(ch);
			}
			
			bis.close();
			
			fin.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
