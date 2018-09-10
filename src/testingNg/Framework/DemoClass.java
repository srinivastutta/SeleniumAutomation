 package testingNg.Framework;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class DemoClass {
    WebDriver driver;
	@BeforeClass
    public void beforeClass() {
	driver= new FirefoxDriver();
	driver.get("http://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
    
    @Test (priority=0)
    public void logIn() {
    WebElement userObj=driver.findElement(By.id("username"));
    if (userObj.isDisplayed()) {
    	Reporter.log("User Element was displayed", true);
    	userObj.sendKeys("user");
        driver.findElement(By.name("pwd")).sendKeys("user");
        driver.findElement(By.xpath(".//*[@id='loginButton']/div")).click();
		
	} else {
		Reporter.log("User Element was not displayed", true);;
	}
}   	
    @Test (priority=1)
    public void logInTest() {
    	String str=driver.findElement(By.linkText("Logout")).getText();
    	System.out.println(str);
    	Assert.assertEquals(str, "Logout");
}
    
    @AfterClass
    public void afterClass() {
    	driver.close();
  }
}