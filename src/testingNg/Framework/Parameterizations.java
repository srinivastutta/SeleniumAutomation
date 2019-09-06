package testingNg.Framework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameterizations {
	WebDriver driver;

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void Launch(String browser, String url) {
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Setup Files\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		} else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
	}

	@Test
	@Parameters({ "username", "password" })
	public void LoginTest(String username, String password) {
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();

	}

	@AfterTest
	public void Teardown() {
		driver.quit();
	}
}
