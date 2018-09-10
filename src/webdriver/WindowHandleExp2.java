package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleExp2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		//to get current window name
		String Parent=driver.getWindowHandle();
		System.out.println(Parent);
		
		driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
		//to get child or all window names
		Set <String> Child=driver.getWindowHandles();
		Iterator<String>Childs=Child.iterator();
		String Win1=Childs.next();
		String Win2=Childs.next();
		
		driver.switchTo().window(Win1);
		Thread.sleep(3000);
		driver.switchTo().window(Win2);
		Thread.sleep(3000);
		driver.switchTo().window(Win1);
		Thread.sleep(3000);
		driver.switchTo().window(Win2);
		
	}

}
