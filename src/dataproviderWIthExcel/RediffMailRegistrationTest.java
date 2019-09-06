package dataproviderWIthExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class RediffMailRegistrationTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Setup Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com");
		
}
	
	@DataProvider
	public Iterator<Object[]> GetTestData() throws BiffException, IOException {
		ArrayList<Object[]>testdata=UtilTest.getDataFromExcel();
		return testdata.iterator();
		
	}
	
		
	@Test(dataProvider="GetTestData")
	public void RegisterTest(String fullname, String Email, String password, String retypepass, String mobile, String day, String month, String year, String country, String city) throws InterruptedException {
		driver.findElement(By.linkText("Create Account")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys(fullname);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys(retypepass);
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys(mobile);
		Select Day = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
		Day.selectByVisibleText(day);
		Select Month = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
		Month.selectByVisibleText(month);
		Select Year = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
		Year.selectByVisibleText(year);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).click();
		Select Country = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		Country.selectByVisibleText(country);
		Select City = new Select(driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select")));
		City.selectByVisibleText(city);
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
