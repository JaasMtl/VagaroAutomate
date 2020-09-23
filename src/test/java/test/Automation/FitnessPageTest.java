package test.Automation;

import org.openqa.selenium.support.PageFactory;
import page.Automation.FitnessPage;
import org.testng.annotations.Test;

public class FitnessPageTest extends BasePageTest {

    //@Test(priority = 2)
     @Test(enabled = false)
     public void checkFitnessTest() throws InterruptedException {
        FitnessPage fitnessPage = PageFactory.initElements(browser, FitnessPage.class);
        fitnessPage.checkFitness();
        waits(2);
     }
}
