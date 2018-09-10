package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExp2 {

	public static void main(String[] args) {
	String Reg="REGISTER";
	WebDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	
	List<WebElement> Links=driver.findElements(By.tagName("a"));
	
	for (WebElement Link : Links) {
		if (Link.getText().equals(Reg)) {
			System.out.println("Register Link is Available");
			Link.click();
			
		}	
	}
	}}
