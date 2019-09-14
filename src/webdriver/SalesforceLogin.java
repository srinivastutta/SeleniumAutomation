package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesforceLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Srinivas");
		driver.findElement(By.id("password")).sendKeys("Srinivas");
		driver.findElement(By.id("Login")).click();

	}
}
