package chapter2;

import java.io.*;

public class FilterReaderDemo {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("E:\\myfolder\\CyberCrimeProjects.txt");
			
			FileReader fr = new FileReader(f);
			
			FilterReader br = new FilterReader(fr) { };
			
			int x;
			
			while((x=br.read())!=-1) {
				
				char ch = (char)x;
				
				System.out.print(ch);
			}
			
			br.close();
			
			fr.close();
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
