package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.Automation.LandingPage;

public class LandingPageTest extends BasePageTest {

    //@Test(enabled = false)
    @Test(priority = 1)
    public void landingPageOn() {
        LandingPage pageLanding = PageFactory.initElements(browser, LandingPage.class);
        pageLanding.logLandingOn();
        waits(2);
        Assert.assertEquals(pageLanding.getTitle(), "Book Your Next Salon, Spa, Or Fitness Appointment | Vagaro");
    }
}