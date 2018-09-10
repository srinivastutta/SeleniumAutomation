package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	
	
	WebElement RightClickMeBtn=driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions act=new Actions(driver);
	
	act.contextClick(RightClickMeBtn).build().perform();
	
	driver.findElement(By.cssSelector(".context-menu-icon-copy")).click();
	driver.switchTo().alert().accept();
	
	String str = RightClickMeBtn.getText();
	System.out.println(str);
	
		}

}
