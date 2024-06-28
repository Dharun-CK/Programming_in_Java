package chapter2;

import java.io.*;

public class BufferedReaderForUserInput {

	public static void main(String[] str) {
		
		try {
			
			/*InputStreamReader ir = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(ir); */
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Roll No : ");
			
			String rollno = br.readLine();
			
			System.out.println("Enter Name : ");
			
			String stname = br.readLine();
			
			System.out.println("Enter Rank : ");
			
			String strank = br.readLine();
			
			int rank = Integer.parseInt(strank);
			
			System.out.println("Enter Mark : ");	
			
			double mark = Double.parseDouble(br.readLine());
			
			System.out.println("Roll No : " + rollno);
			System.out.println("Name : " + stname);
			System.out.println("Rank : " + rank);
			System.out.println("Mark : " + mark);
			
		}catch(Exception obj) {		
			
			obj.printStackTrace();
		}
	}
}

