package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowseURL {

	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		String str=driver.getPageSource();
		System.out.println(str);
	}

}
