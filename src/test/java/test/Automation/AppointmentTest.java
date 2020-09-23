package test.Automation;

import org.testng.annotations.Test;
import page.Automation.AppointmentPage;
import org.openqa.selenium.support.PageFactory;


public class AppointmentTest extends BasePageTest {

    //  @Test(priority = 3, enabled = false)
      @Test(enabled = false)
     // @Test(priority = 2)
      public void checkMyAppointments() throws InterruptedException {
        AppointmentPage pageAppointment = PageFactory.initElements(browser, AppointmentPage.class);
        waits(2);
       pageAppointment.checkAppointment();

    }
}