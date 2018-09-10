package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement1 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Creating WebElement
		String id="srinivas";
		WebElement obj=driver.findElement(By.id("u_0_c"));
        obj.click();
        obj.sendKeys(id);
		//to read the data from editbox
		String Val=obj.getAttribute("value");
		System.out.println(Val);
		
		if (Val.equals(id)) {
			System.out.println("Enter Value is matching");
		}
		else {
				System.out.println("Enter Value is mismatching");	
			}
		obj.clear();
		}
	}
