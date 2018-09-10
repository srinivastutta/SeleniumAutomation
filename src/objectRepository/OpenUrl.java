package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenUrl {
	WebDriver driver;
	
	public void URL(){
		driver =new FirefoxDriver();
		driver.get("http://rediffmail.com");
		driver.manage().window().maximize();
	
}}
