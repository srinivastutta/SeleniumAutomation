package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableExp1 {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://w3schools.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Learn HTML")).click();
	driver.findElement(By.linkText("HTML Tables")).click();
	
	//to read cell data
	String CellData=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText();
	System.out.println(CellData);
	
	}

}
