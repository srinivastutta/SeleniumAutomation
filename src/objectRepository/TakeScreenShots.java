package objectRepository;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShots{

	public void CaptureScreenShot(WebDriver driver, String screenshotname){
	
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname+".png"));
			System.out.println("Screenshot taken");
			
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot "+e.getMessage());
		}
	}
}
