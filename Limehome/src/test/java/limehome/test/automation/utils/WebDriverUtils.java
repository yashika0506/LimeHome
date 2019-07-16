package limehome.test.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {

    public static void click(WebDriver driver, WebElement element) {
        element.click();
    }

    public static void type(WebDriver driver, WebElement element, String textToType) {
        element.sendKeys(textToType);
    }
    
    public static void clickByClassName(WebDriver driver, String className) {
        driver.findElement(By.className(className)).click();
    }
    

}