package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UPandDownArrow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement Type=driver.findElement(By.name("q"));
		Type.sendKeys("Selenium");
		Thread.sleep(2000);
		Type.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Type.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Type.sendKeys(Keys.ENTER);
		
	}

}
