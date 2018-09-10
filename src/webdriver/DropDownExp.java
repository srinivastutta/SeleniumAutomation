package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownExp {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://spicejet.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.linkText("Goa (GOI)")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Amritsar (ATQ)")).click();

	}

}
