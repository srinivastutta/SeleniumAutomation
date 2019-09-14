package webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpNDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);

		//to scroll down
		js.executeScript("window.scrollBy(0, 2500)");
		Thread.sleep(3000);
		
		//to scroll up
		js.executeScript("window.scrollBy(0, -1500)");
		Thread.sleep(3000);
		
		

	}

}
