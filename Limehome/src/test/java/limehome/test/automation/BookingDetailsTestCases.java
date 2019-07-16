package limehome.test.automation;

import limehome.test.automation.Locators.BookingDetailsRepository;
import limehome.test.automation.Screens.BookingDetailsScreen;
import limehome.test.automation.Screens.CheckInScreen;
import limehome.test.automation.utils.WebDriverUtils;
import limehome.test.automation.utils.WebDriverWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static limehome.test.automation.utils.WebDriverConstants.LAST_NAME;
import static limehome.test.automation.utils.WebDriverConstants.REFERENCE_ID;
import static limehome.test.automation.utils.WebDriverConstants.URL;

public class BookingDetailsTestCases {

    private WebDriver driver;



    @BeforeClass
    public void init(){
        System.out.println(System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
        //System.out.println(driver.toString());
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      //  WebDriverWaits.implicitWait(50);
        System.out.println("end of init");

    }

    @Test
    public void verify_CheckInScreen_Submit() throws InterruptedException {

        new CheckInScreen(driver).CheckInScreen_Submit(LAST_NAME,REFERENCE_ID);
    }


    @Test
    public void verify_LastName_Correct() {
        new BookingDetailsScreen(driver).verify_LastName_Correct();
    }


    @Test
    public void verify_LastName_Correct_German() {
        WebDriverUtils.click(driver, new BookingDetailsRepository(driver).germanTranslator);
        new BookingDetailsScreen(driver).verify_LastName_Correct();
    }
}
