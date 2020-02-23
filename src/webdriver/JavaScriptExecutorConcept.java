package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorConcept {

    public static String Month = "December";
	public static String day = "14";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Select To
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Hyderabad (HYD)");
		Thread.sleep(2000);
		// Select From
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Goa (GOI)");

		while (true) {// Take xpath of month and store in variable, so it will check to current month
						// to given month
						// when condition given month is equals to text, the loop will be break
			String text = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]"))
					.getText();
			// System.out.println(text);
			if (text.equals(Month))

			{
				break;
			} else {// if above condition not satisfied it moves to else condition and click on next
					// month arrow button
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
			}

		}
		//below is customize xpath, taken xpath from one date and removed tr and td array numbers and then added text()=parameter of date
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td/a[1][text()=" + day + "]"))
				.click();

	}
}
