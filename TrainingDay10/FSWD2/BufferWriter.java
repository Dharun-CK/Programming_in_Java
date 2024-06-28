package FSWD2;
import java.io.*;
public class BufferWriter {
public static void main(String[] args) {
	try {
		
		File f = new File("E:\\NS LAB\\Files Handling\\writeDemo.txt");
		
	FileWriter fw =new FileWriter(f);
	BufferedWriter bw =new BufferedWriter(fw);
	String m = "I'M STARCKKKKKKKKKKKKKKKKKKKKK";
	bw.write(m);
	bw.close();
	System.out.println("Success.......");
	
	
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
