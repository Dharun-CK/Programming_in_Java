package FSWD2;
import java.io.*;
public class FileOS {
public static void main(String[] args) {
	try {
		File f1 = new File("E:\\NS LAB\\Files Handling\\file1.txt");
		File f2 = new File("E:\\NS LAB\\Files Handling\\file2.txt");
		FileOutputStream bf = new FileOutputStream(f1);
		
		String msg="HI!  Heloooooooooooooooooooooooooo";
		byte[] bt=msg.getBytes();
		bf.write(bt);
		bf.close();
		
	}catch(Exception e)
	{
		e.getStackTrace();
	}
}
}
