package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Automation.DailyDealsPage;

public class DailyDealsPageTest extends BasePageTest {

    @Test(enabled = false)
    // @Test(priority = 2)
    public void checkDailyDeals() throws InterruptedException {
        DailyDealsPage dailyDealsPage = PageFactory.initElements(browser, DailyDealsPage.class);
        dailyDealsPage.getDailyDeals();
        waits(2);
        // Assert.assertEquals(browser.getTitle(),"Great  Deals in Montreal, QUEBEC, Ca | Vagaro");
    }
}
