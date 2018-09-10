package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownExp {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	
	Select Mylist= new Select(driver.findElement(By.id("month")));
	Thread.sleep(3000);
	Mylist.selectByVisibleText("Sep");
	Thread.sleep(3000);
	Mylist.selectByIndex(10);
	Thread.sleep(3000);
	Mylist.selectByValue("4");
	
	
	
	}

}
