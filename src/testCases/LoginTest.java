package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objectRepository.RediffHomePg;
import objectRepository.RediffLoginPg;

public class LoginTest {
	public WebDriver driver;
	@Parameters("Browsers")
	@BeforeClass
	public void Broswer(String Browsers){
		if (Browsers.equalsIgnoreCase("firefox")) {
			driver =new FirefoxDriver();
			driver.get("http://rediffmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		}else if (Browsers.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://rediffmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}else if (Browsers.equalsIgnoreCase("IE")) {
			System.getProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("http://rediffmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}}
	
	@Test
	public void Login() throws InterruptedException{
		RediffLoginPg RLP= PageFactory.initElements(driver, RediffLoginPg.class);
		RediffHomePg RHP= PageFactory.initElements(driver, RediffHomePg.class);
		
		
		RLP.SigninObj(driver).click();
		Thread.sleep(3000);
		RHP.IdObj(driver).sendKeys("Madhukar");
		RHP.PwdObj(driver).sendKeys("Mercury");
		RHP.GoObj(driver).click();
		String Til=driver.getTitle();
		System.out.println(Til);
		Assert.assertEquals(Til, "Rediffmail");
		Reporter.log("Passed", true);
		
	}
	
	@AfterClass
	public void Teardown(){
		driver.close();
}
}
