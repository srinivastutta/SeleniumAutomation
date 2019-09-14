package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountingLinksInPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		// to get the link count
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Link count is " + Links.size());
		// to write the links
		for (WebElement LinkName : Links) {
			System.out.println(LinkName.getText());
		}

	}

}
