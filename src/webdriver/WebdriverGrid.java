package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();

		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get("http://gmail.com");
		driver1.manage().window().maximize();

	}

}
