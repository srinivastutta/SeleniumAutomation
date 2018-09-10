package modularFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildClass extends Parent1{
	static WebDriver driver;
	public void StartBrowser(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	
	public static void main(String[] args) throws InterruptedException {
		ChildClass cc= new ChildClass();
		cc.StartBrowser();
		cc.userReg(driver);
		cc.userLogin(driver);
		cc.tearDown(driver);
	}
}
