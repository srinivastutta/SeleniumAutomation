package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		WebElement RightClickMeBtn=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//To print ButtonName
		String str = RightClickMeBtn.getText();
		System.out.println("Button Name is "+str);
		
		//To print AttributeValue
		//System.out.println("Attribute value is " +RightClickMeBtn.getAttribute("class"));
		
		//boolean IsEnabled=RightClickMeBtn.isEnabled();
		boolean IsDisplayed=RightClickMeBtn.isDisplayed();
		
		//To Check Button Is Enabled or not
		
//		if(IsEnabled){
//			System.out.println("Button is Enabled");
//		}else{System.out.println("Button is not Enabled");}
//		
		//To Check Button Is Displayed or not
		if(IsDisplayed){
			System.out.println("Button is Displayed");
		}else{System.out.println("Button is not Enabled");}
	
		//To Check WebElment is present or not (Postive Testing)
			
//			try {driver.findElement(By.xpath("//span[text()='right click me']"));
//			System.out.println("Element is Present");
//		} 	catch (Exception e) {
//			System.out.println("Element is not Present");
//		
//		}
//			//To Check WebElment is present or not(Negative Testing)
			
//			try {driver.findElement(By.xpath("//aaaaaaaaaaaaaaaa']"));
//			System.out.println("Element is Present");
//		} 	catch (Exception e) {
//			System.out.println("Element is not Present");
//		
//		}
		
		}	}
