package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BookingHomePage;
import tests.BaseTest;

import java.io.IOException;

public class BookingSteps extends BaseTest {

    @Before
    public void initCucumber() {
        init("Chrome", "95", 30);
    }

    @After
    public void tearDown() throws IOException {
        reportScreenshot("Test", "TestAllure");
        //quitDriver();
    }

    @Given("I am on booking home page")
    public void iAmOnBookingHomePage() {
        driver.get("https://www.booking.com/");
    }

    @When("I change language to {string}")
    public void iChangeLanguageTo(String language) {
        BookingHomePage bookingHomePage = new BookingHomePage(driver, wdWait);
        bookingHomePage.selectLanguage(language);
    }

}