package chapter2;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("D:\\nandhaclg\\files\\student.xlsx");
			
			FileInputStream fin = new FileInputStream(f);
			
			XSSFWorkbook xb = new XSSFWorkbook(fin);
			
			XSSFSheet xs = xb.getSheet("stud");
			
			XSSFRow r = xs.getRow(5);
			
			XSSFCell c = r.getCell(6);
			
			
			switch(c.getCellType()) {
			
			case Cell.CELL_TYPE_STRING:
				
				String result1 = c.getStringCellValue();
				
				System.out.println(result1);
				
				break;
				
			case Cell.CELL_TYPE_NUMERIC:
				
				double result2 = c.getNumericCellValue();
				
				System.out.println(result2);
				
				break;
				
			}
			
			fin.close();
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
