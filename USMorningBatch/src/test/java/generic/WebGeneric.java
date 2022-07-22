package generic;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class WebGeneric {
	public void verifyTitle(WebDriver driver, String expectedTitle) throws InterruptedException{
		Thread.sleep(2000);
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			Reporter.log("Homepage displayed",true);
		}
		else {
			Reporter.log("Homepage not displayed",true);
		}	
	}
}