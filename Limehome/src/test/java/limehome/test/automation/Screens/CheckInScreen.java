package limehome.test.automation.Screens;

import limehome.test.automation.Locators.BookingDetailsRepository;
import limehome.test.automation.Locators.CheckInRepository;
import limehome.test.automation.utils.WebDriverConstants;
import limehome.test.automation.utils.WebDriverUtils;
import limehome.test.automation.utils.WebDriverWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class CheckInScreen {

    private final WebDriver driver;
    public CheckInRepository checkInRepo;

    public  CheckInScreen(WebDriver driver) {
        this.driver=driver;
        checkInRepo= new CheckInRepository(driver);
    }

    public void CheckInScreen_Submit(String lastName, String referenceId)  {
        Assertion assertion = new Assertion();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWaits.implicitWait(10);
       WebDriverUtils.type(driver, checkInRepo.lastName, lastName);
       WebDriverUtils.type(driver, checkInRepo.bookingReference, referenceId);
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       WebDriverUtils.click(driver, checkInRepo.submitButton);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       assertion.assertTrue(new BookingDetailsRepository(driver).limeHomeHeader.isDisplayed(), "The limehome image is displayed" +
           " " + "so the user has successfully fetched the Booking Details and is on Booking details screen");

    }


}
