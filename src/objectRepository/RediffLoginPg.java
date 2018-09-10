package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffLoginPg {
	//Assign Locator Value
	@FindBy(xpath=".//*[@id='signin_info']/a[1]")
	WebElement signin;
	
	//to return obj
	public WebElement SigninObj(WebDriver driver){
		return(signin);
	}
}
