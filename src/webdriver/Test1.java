package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void A(){
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://makemytrip.com");
		
		WebElement Rtn=driver.findElement(By.id("hp-widget__return"));
		
		if (Rtn.isDisplayed()) {
			System.out.println("Return field is displayed");
		}
		else {
				System.out.println("Retrun fied is not displayed");
}
	}

}
