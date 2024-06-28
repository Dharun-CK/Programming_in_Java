package chapter2;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadBulkDataFromExcel {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("D:\\nandhaclg\\files\\Employee.xlsx");
			
			FileInputStream fin = new FileInputStream(f);
			
			XSSFWorkbook xb = new XSSFWorkbook(fin);
			
			XSSFSheet xs = xb.getSheet("emp_data");
			
			Iterator<Row> row_ite = xs.iterator();
			
			while(row_ite.hasNext()) {
				
				Row r = row_ite.next();
				
				Iterator<Cell> c = r.iterator();
				
				while(c.hasNext()) {
					
					Cell cell = c.next();
					
					switch(cell.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						
						String result1 = cell.getStringCellValue();
						
						System.out.print(result1 + "      ");
						
						break;
						
					case Cell.CELL_TYPE_NUMERIC:
						
						double result2 = cell.getNumericCellValue();
						
						System.out.print(result2 + "      ");
						
						break;
					}
				}
				
				System.out.println();
			}
			
			fin.close();
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
