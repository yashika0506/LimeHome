package limehome.test.automation.Screens;

import limehome.test.automation.Locators.BookingDetailsRepository;
import limehome.test.automation.Locators.CheckInRepository;
import limehome.test.automation.utils.WebDriverConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;

public class BookingDetailsScreen {

    private final WebDriver driver;
    public BookingDetailsRepository bookingRepo;

    public  BookingDetailsScreen(WebDriver driver) {
        this.driver=driver;
        bookingRepo= new BookingDetailsRepository(driver);
    }


    public void verify_LastName_Correct() {

        Assertion assertion = new Assertion();
        String lastNameText = bookingRepo.lastNameOnDetailsPage.getAttribute("ng-reflect-model");
        assertion.assertEquals(lastNameText, WebDriverConstants.LAST_NAME);


    }
}
