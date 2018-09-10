package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePg {
	@FindBy(name="login")
	WebElement emailid;

	@FindBy(name="passwd")
	WebElement pwd;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement go;
	
	public WebElement IdObj (WebDriver driver){
		return(emailid);
	}
		
	public WebElement PwdObj (WebDriver driver){
		return(pwd);
	}		
	public WebElement GoObj (WebDriver driver){
		return(go);
				
 	}
}
