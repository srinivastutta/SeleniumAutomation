package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGExp {
	WebDriver driver;
	@BeforeClass
	public void Broswer(){
		
		driver =new FirefoxDriver();
		driver.get("http://rediffmail.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Login(){
		driver.findElement(By.linkText("Sign in")).click();
	}

	@AfterClass
	public void TearDown(){
		driver.close();
	}
}
