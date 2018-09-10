package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableExp3 {

	public static void main(String[] args) {
        //write a script to find number of row, number of columns in each row, and to read each cell value
		WebDriver driver = new FirefoxDriver();
		driver.get("http://w3schools.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Learn HTML")).click();
		driver.findElement(By.linkText("HTML Tables")).click();
        
		//create reference object for Webtable
		WebElement MyTable=driver.findElement(By.id("customers"));
		
		//to find number of rows
		List<WebElement> trs= MyTable.findElements(By.tagName("tr"));
		System.out.println("Number of row count is " +trs.size());
		
		//to find number of columns in each row
		for (WebElement tr : trs) {
			List<WebElement> td=tr.findElements(By.tagName("td"));
			System.out.println("Number of Columns in each row " +td.size());
			for (WebElement tds : td) {
				System.out.println(tds.getText());
			}
			System.out.println("***************************");
		}
		
		
		
		
	}

}
