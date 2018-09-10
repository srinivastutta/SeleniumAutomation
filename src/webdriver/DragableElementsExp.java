package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragableElementsExp {

	public static void main(String[] args) {
	WebDriver driver =new FirefoxDriver();
	driver.get("http://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	WebElement ele1=driver.findElement(By.xpath(".//*[@id='draggable']"));
	WebElement ele2=driver.findElement(By.xpath(".//*[@id='droppable']"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(ele1, ele2).build().perform();
	
	}

}
