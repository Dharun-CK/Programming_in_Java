package chapter2;

import java.io.*;

public class BufferedReaderForFile {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("E:\\myfolder\\CyberCrimeProjects.txt");
			
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			
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
