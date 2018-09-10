package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExp2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		
		//type-casting to "Currency" dropdown 
		Select myDropDown=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		
		//to select 1st item
		myDropDown.selectByIndex(0);
		
		//to pause the execution 
		Thread.sleep(2000);
		
		//to select item which have the value as "INR"
		myDropDown.selectByValue("INR");
		
		Thread.sleep(2000);
		
		//to select item by visibletext "AED"
		myDropDown.selectByVisibleText("AED");
		
		List<WebElement> Options=myDropDown.getOptions();
		System.out.println("No of DropDowns " +Options.size());
		
		//to read
		
		for (WebElement drop: Options) {
			System.out.println(drop.getText());
		}
	
	}
		
	
	}