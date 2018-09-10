package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebApplication {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability("deviceName", "0ed6de780404");
		dc.setCapability(CapabilityType.VERSION, "7.0 NRD90M");
		
		dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		
		AndroidDriver driver=new AndroidDriver (new URL("http://192.168.1.35:4723/wd/hub"),dc);
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='SBmmZd']/a[2]")).click();
		Thread.sleep(3000);
		WebElement Image=driver.findElement(By.id("hplogo"));
		if (Image.isDisplayed()==true) {
			System.out.println("GoogleImage is Displayed.  Test Passed");
		}else{
			System.out.println("GoogleImage is not Displayed.  Test Failed ");
		}
			}
}