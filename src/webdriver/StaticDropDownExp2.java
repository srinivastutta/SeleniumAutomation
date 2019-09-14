package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownExp2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

		// type caste dropdown with select class
		Select myList = new Select(driver.findElement(By.id("month")));
		// read selected value from dropdown
		WebElement option = myList.getFirstSelectedOption();
		String month = option.getText();
		System.out.println(month);
		// if it
		if (month.equals("Jul")) {
			System.out.println("Month is already Selected");
		} else {
			myList.selectByValue("9");
			System.out.println("Month is slected WD");
		}
	}

}
