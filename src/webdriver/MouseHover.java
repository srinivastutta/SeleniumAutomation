package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ele1=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
		WebElement ele2=driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span"));

		Actions act= new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(ele1).moveToElement(ele2).click().build().perform();
		
	}

}
