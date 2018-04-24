package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumberOfRowAndColumnOfAWorkbook {

	public static void main(String[] args) throws Exception {
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\IBM_ADMIN\\Downloads\\Automation_KT_Tracker.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet1=workbook.getSheet("Automation_KT_Tracker");
			XSSFRow row=sheet1.getRow(0);
			int column=row.getLastCellNum();
			System.out.println(column);
			int rownum=sheet1.getLastRowNum()+1;
			System.out.println(rownum);
			int rowcount=sheet1.getLastRowNum() - sheet1.getFirstRowNum()+1;
			System.out.println(rowcount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
