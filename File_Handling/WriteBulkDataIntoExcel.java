package chapter2;

import java.io.*;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteBulkDataIntoExcel {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("D:\\nandhaclg\\files\\Employee.xlsx");
			FileOutputStream fout = new FileOutputStream(f);
			
			XSSFWorkbook xb = new XSSFWorkbook();
			XSSFSheet xs = xb.createSheet("emp_data");
			
			@SuppressWarnings("checked")
			Map<Integer,Object[]> m = new HashMap();
			
			Object[] ob = {"Emp ID","Emp Name","Salary","Incentive"};
			Object[] ob1 = {"emp-1","abc",35000.00,5000.00};
			Object[] ob2 = {"emp-2","def",25000.00,2500.00};
			
			m.put(1, ob); //row-1
			m.put(2, ob1);//row-2
			m.put(3, ob2);//row-3
			
			
			
			Set<Integer> st = m.keySet();
			Iterator<Integer> ite = st.iterator();
			int r = 0;
			while(ite.hasNext()) {
				Integer key = ite.next();
				XSSFRow row = xs.createRow(r++);
				
				Object[] value = m.get(key);
				
				int c=0;
				
				for(int i=0; i<value.length; i++) {
					XSSFCell cell = row.createCell(c++);
					
					if(value[i] instanceof String) {
						cell.setCellValue((String)value[i]);
					
					}else if(value[i] instanceof Double) {
						cell.setCellValue((double)value[i]);
					}
				}
			}
			
			xb.write(fout);
			fout.close();
			
			System.out.println("Success...");
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
