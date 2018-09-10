package dataDrivenFramework;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelCreateNWriteData {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		//Specify Path of the file
		File fo= new File("D:\\StudentInfo.xls");
		//to create file
		WritableWorkbook wb=Workbook.createWorkbook(fo);
		WritableSheet ws=wb.createSheet("Students", 1);
		
		Label cell1= new Label(0,0, "StName");
		ws.addCell(cell1);
		Label cell2= new Label(1,0, "Course");
		ws.addCell(cell2);
		Label cell3= new Label(0,1, "Srinivas");
		ws.addCell(cell3);
		Label cell4= new Label(1,1, "Qtp");
		ws.addCell(cell4);
		Label cell5= new Label(0,2, "Veni");
		ws.addCell(cell5);
		Label cell6= new Label(1,2, "Selenium");
		ws.addCell(cell6);
		
		
		wb.write();
		wb.close();

	}

}
