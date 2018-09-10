package webdriver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {

	public static void main(String[] args) {
	Logger logger=Logger.getLogger("Log4j");
	
	PropertyConfigurator.configure("Log4j.properties");
	
	WebDriver driver=new FirefoxDriver();
	logger.info("FirefoxLanched");
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	logger.info("URLentered and Mamimized Window");
	driver.findElement(By.id("username")).sendKeys("Srinivas");
	logger.info("UserName Entered");
	driver.findElement(By.id("password")).sendKeys("Srinivas");
	logger.info("Password Entered");
	driver.findElement(By.id("Login")).click();
	logger.info("Clicked Login Button");
	
	

	}

}
