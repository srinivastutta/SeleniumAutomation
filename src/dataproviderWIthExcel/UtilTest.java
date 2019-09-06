package dataproviderWIthExcel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UtilTest {

	public static ArrayList<Object[]> getDataFromExcel() throws BiffException, IOException {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		File fi = new File("E:\\Selenium\\Workspace\\SeleniumAutomation\\src\\dataproviderWIthExcel\\TestData.xls");

		Workbook wb = Workbook.getWorkbook(fi);
		Sheet ws = wb.getSheet("Sheet1");

		// to find number of rows
		System.out.println("Number of rows are : " + ws.getRows());

		for (int rowCount = 1; rowCount <= ws.getRows()-1; rowCount++) {
			String fullname = ws.getCell(0, rowCount).getContents();
			String Email = ws.getCell(1, rowCount).getContents();
			String password = ws.getCell(2, rowCount).getContents();
			String retypepass = ws.getCell(3, rowCount).getContents();
			String mobile = ws.getCell(4, rowCount).getContents();
            String day = ws.getCell(5, rowCount).getContents();
			String month = ws.getCell(6, rowCount).getContents();
			String year = ws.getCell(7, rowCount).getContents();
			String country = ws.getCell(8, rowCount).getContents();
			String city = ws.getCell(9, rowCount).getContents();

			Object ab[] = { fullname, Email, password, retypepass, mobile, day, month, year, country, city };
			myData.add(ab);

		}
		return myData;

	}
}
