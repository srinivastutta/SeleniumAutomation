package dataDrivenFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class MultipleLogin {
	WebDriver driver;
	
	public void Intialize(){
	driver =new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	}
	public void Login() throws BiffException, IOException, InterruptedException, RowsExceededException, WriteException{
	File fi=new File("D:\\Mercury.xls");
	Workbook wb=Workbook.getWorkbook(fi);
	Sheet ws=wb.getSheet(0);
	
	for (int i = 1; i <= ws.getRows()-1; i++) {
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.name("userName")).sendKeys(ws.getCell(0,i).getContents());
		
		driver.findElement(By.name("password")).sendKeys(ws.getCell(1,i).getContents());
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String PageTitle=driver.getTitle();
		
		if (PageTitle.equals("Find a Flight: Mercury Tours:")){
			System.out.println("Valid User/Pass");;}
		else {
			System.out.println("Invalid User/Pass");;
}
	}}

	public void BrowserClose(){
		driver.close();
	}
	
	public static void main(String[] args) throws BiffException, IOException, InterruptedException, RowsExceededException, WriteException {
	MultipleLogin obj= new MultipleLogin();
		
		obj.Intialize();
		obj.Login();
		obj.BrowserClose();
		
}}
