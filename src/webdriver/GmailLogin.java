package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		String appurl="https://www.google.com/gmail/about/#";	
		
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Signin=driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in"));
	    
	    Actions act=new Actions(driver);
		act.moveToElement(Signin).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("srinivas.tutta@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content/span")).click();
	}
}
