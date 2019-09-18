package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

//Author Srinivas
public class WebdriverGrid {

	@Test
	public void FirefoxTest() {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}

	@Test
	public void IETest() {

		System.setProperty("webdriver.ie.driver", "E:\\Selenium\\Selenium Setup Files\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.get("http://gmail.com");
		driver1.manage().window().maximize();

	}
}
