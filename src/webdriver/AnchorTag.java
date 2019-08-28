package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AnchorTag {

	public static void main(String[] args) throws InterruptedException {
		String appurl="https://www.google.com/gmail/about/#";	
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		links.get(2).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("**ABCD*****");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("*****");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}}
