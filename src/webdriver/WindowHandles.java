package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Setup Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();

		// to get current window name
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);

		driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[1]/a")).click();
		Thread.sleep(3000);

		// to get child or all window names
		Set<String> Child = driver.getWindowHandles();

		// for each loop to check the condition in all windows
		for (String Childs : Child) {
			// condition: Parent(window1) not equal to Child(other window)
			// then switch to other window
			if (!Parent.equalsIgnoreCase(Childs)) {
				driver.switchTo().window(Childs);
				// click on "Create a Google Account"
				driver.findElement(By.linkText("Create a Google Account")).click();
			}
		}
		// to get back to Parent (Window1)
		driver.switchTo().window(Parent);
		// enter value in window1
		driver.findElement(By.id("identifierId")).sendKeys("PamidiSrinivas");
	}
}
