package dataDrivenFramework;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadData {

	public static void main(String[] args) throws BiffException, IOException {
		//Specify Path File
		File fi= new File("D:\\StudentInfo.xls");
		
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet    ws=wb.getSheet("Students");
		
		//to find number of rows
		System.out.println("Number of rows are : "+ws.getRows());
	
		//to find number of columns
		System.out.println("Number of colums are : "+ws.getColumns());
		
		//to read Cell data
		for (int i = 0; i <= ws.getRows()-1; i++) {
			for (int j = 0; j <= ws.getColumns()-1; j++) {
				System.out.println(ws.getCell(j, i).getContents());
}
			System.out.println("****************************");
		}
		wb.close();
	}
}
