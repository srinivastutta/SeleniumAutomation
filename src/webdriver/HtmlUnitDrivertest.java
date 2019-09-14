package webdriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDrivertest {

	public static void main(String[] args) {
			
		HtmlUnitDriver driver= new HtmlUnitDriver();

		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		String Title=driver.getTitle();
		System.out.println(Title);

}}
