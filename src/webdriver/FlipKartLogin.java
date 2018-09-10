package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import objectRepository.TakeScreenShots;

public class FlipKartLogin extends TakeScreenShots {

	WebDriver driver;
	
	public void Startup(){
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	public void Signin(){
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("9704966577");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("Vedik2015");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
			
	}
	public void Daildeals() throws InterruptedException{
		FlipKartLogin fk=new FlipKartLogin ();
		Thread.sleep(3000);
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy (0,1000)");
		driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/div/div/a")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='_1Nyybr _30XEf0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/a[1]/div[1]/div/div[1]/img")).click();
		Thread.sleep(3000);
		Set<String> Window=driver.getWindowHandles();
		Iterator<String>Windows=Window.iterator();
		String Win1=Windows.next();
		String Win2=Windows.next();
		driver.switchTo().window(Win2);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Q4i61 _7UHT_c']")).click();
		fk.CaptureScreenShot(driver, "FlipkartScreen");
	}
	public static void main(String[] args) throws InterruptedException {
		FlipKartLogin fk=new FlipKartLogin();
		fk.Startup();
		fk.Signin();
		fk.Daildeals();
	}
		
}
