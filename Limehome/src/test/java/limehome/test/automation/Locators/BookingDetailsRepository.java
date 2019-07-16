package limehome.test.automation.Locators;

import limehome.test.automation.BookingDetailsTestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDetailsRepository {

    private WebDriver driver;

    public BookingDetailsRepository(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//span[text()='Your booking details.']")
    public WebElement limeHomeHeader;

    @FindBy(xpath="//div[contains(@class,'booking-details')]/div/div[12]/mat-form-field/div/div[1]/div/input")
    public WebElement lastNameOnDetailsPage;

    @FindBy(xpath="//div[@class='col-form-6 language']/a[2]/span")
     public WebElement germanTranslator;









}
