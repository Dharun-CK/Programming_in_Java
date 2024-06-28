package chapter2;

import java.io.*;

public class DataInputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			DataInputStream dis = new DataInputStream(System.in);
			
			System.out.println("Enter Name : ");
			
			String stname = dis.readLine(); //readUTF()
			
			System.out.println("Enter Rank : ");
			
			int strank = dis.readInt();
			
			System.out.println("Enter Mark : ");
			
			double stmark = dis.readDouble();
			
			System.out.println("Name : " + stname);
			
			System.out.println("Rank : " + strank);
			
			System.out.println("Mark : " + stmark);
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
