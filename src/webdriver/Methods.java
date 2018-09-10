package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods {
	WebDriver driver;
	
	public void OpenUrl(){
	driver=new FirefoxDriver();
	driver.get("http://spicejet.com");
	driver.manage().window().maximize();
	}

	public void OnewayBooking() throws InterruptedException{
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Goa (GOI)")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Tirupati (TIR)")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("27")).click();
	Thread.sleep(2000);
	Select Cur= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	Thread.sleep(2000);
	Cur.selectByVisibleText("INR");
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Methods mt= new Methods();
		mt.OpenUrl();
		mt.OnewayBooking();
				
	}

}
