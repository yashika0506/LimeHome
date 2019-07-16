package limehome.test.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverWaits {

  public static WebDriver driver;
	 
	 //implicitwait
	 public static void implicitWait(int seconds) {
		 driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	 }
	
     //explicit or conditional wait
	 public static void explicitWaitForBrowserTitleToBePresent(int seconds, String title) {
		 Wait w = new WebDriverWait(driver, seconds);
		 w.until(ExpectedConditions.titleContains(title));
		 
	 }
	 
	 public static void explicitWaitForElementToBeClickable(int seconds, WebElement element) {
		 Wait w = new WebDriverWait(driver, seconds);
		 w.until(ExpectedConditions.elementToBeClickable(element));
		 
	 }
	 
	// public void explicitWaitFor
	 
	 
	  //hard wait
	 public static void hardwait(int seconds) throws InterruptedException {
		 Thread.sleep(seconds*1000);
	 }
	 
	 
}
