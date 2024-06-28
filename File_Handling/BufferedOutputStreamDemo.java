//package File_Handling;
import java.io.*;
public class BufferedOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("E:\\NS LAB\\Files Handling\\BufferedOut.txt");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String msg = "Buffered output stream";
			
			byte[] by = msg.getBytes();
			
			bout.write(by);
			
			bout.close();
			
			fout.close();
			
			System.out.println("Success ...");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
