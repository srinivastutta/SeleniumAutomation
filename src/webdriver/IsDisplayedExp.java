package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayedExp {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://makemytrip.com");
		
		System.out.println("Before Clicking MultiCity");
	
		WebElement Rtn=driver.findElement(By.id("hp-widget__return"));
		
		if (Rtn.isDisplayed()) {
			System.out.println("Return field is displayed");
		}
		else {
				System.out.println("Retrun fied is not displayed");
}

		System.out.println("After clicking MultiCity");
		
		driver.findElement(By.xpath("//label[text()='multi-city']")).click();
		if (Rtn.isDisplayed()) {
			System.out.println("Return field is displayed");
		}
		else {
				System.out.println("Retrun fiel is not displayed");

	
	}}}
