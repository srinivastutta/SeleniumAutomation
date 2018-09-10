package extentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentREport {
		 	
	public ExtentReports extent; //Specify the location of the report
	public ExtentTest extentTest; // What details should be populated in the report
	public WebDriver driver;
	
	@BeforeTest
	public void StartReport(){
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);
		extent.addSystemInfo("Host Name","Local Host");
		extent.addSystemInfo("Environment","QA");
		extent.addSystemInfo("User Name","Srinivas Tutta");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		
	}
	
	@Test
	public void Google (){
	 	extentTest=extent.startTest("Google");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	    WebElement obj= driver.findElement(By.id("lst-ib"));
		obj.sendKeys("Selenium");
		if(obj.getText().equalsIgnoreCase("Selenium")){
			System.out.println("Typed text is Selenium");
		}
	
	}
	
	@AfterMethod
	public void getResults(ITestResult result)throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
		extentTest.log(LogStatus.FAIL, result.getName());
		extentTest.log(LogStatus.FAIL, result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS, result.getTestName());
		}
	extent.endTest(extentTest);
	
	}
	@AfterClass
	public void TearDown(){
		driver.close();
	}
}	