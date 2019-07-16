package limehome.test.automation.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInRepository {

   private WebDriver driver;

    public CheckInRepository(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath="//*[@id='mat-input-0']")
    public WebElement lastName;

    @FindBy(id="mat-input-1")
    public WebElement bookingReference;

    @FindBy(xpath="//span[text()='Submit']")
    public WebElement submitButton;

}
