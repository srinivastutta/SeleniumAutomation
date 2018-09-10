package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableExp2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://w3schools.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Learn HTML")).click();
		driver.findElement(By.linkText("HTML Tables")).click();
        
		//Create reference object for Webtable
		WebElement td=driver.findElement(By.id("customers"));

		//to get all td tags within that table
		List<WebElement> tags= td.findElements(By.tagName("td"));
		
		for (WebElement tag : tags) {
			System.out.println(tag.getText());
			
		}
		
	}

}
