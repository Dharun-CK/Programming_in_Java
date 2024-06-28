package FSWD2;
import java.util.*;
import java.io.*;
public class bufferoutStream {
public static void main(String[] args) {
	try {
		File f2 = new File("E:\\NS LAB\\Files Handling\\twoin1.txt");
		File f3 = new File("E:\\NS LAB\\Files Handling\\twoin1.doc");
		FileOutputStream bf = new FileOutputStream(f2);
		FileOutputStream bf1 = new FileOutputStream(f3);
		BufferedOutputStream r = new BufferedOutputStream(bf);
		BufferedOutputStream r1 = new BufferedOutputStream(bf1);
		String msg ="HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII I'm CK";
		byte[]b1 =msg.getBytes();
		r.write(b1);
		r1.write(b1);
		r.close();
		r1.close();
		System.out.println("Success..........");
		
		
		
	}catch(Exception a)
	{
		a.printStackTrace();
	}
}
}
