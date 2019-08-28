package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExp1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		
		List<WebElement> check=driver.findElements(By.name("Checkbox"));
		for (WebElement Chk : check) {
			if (Chk.isSelected()==false) {
				Chk.click();
}}
		}}