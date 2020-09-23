package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Automation.MakeUpPage;

public class MakeUpPageTest extends BasePageTest {

    @Test(priority = 2)
   // @Test(enabled = false)
    public void checkMakeUpPage (){
        MakeUpPage makeUpPage = PageFactory.initElements(browser,MakeUpPage.class);
        makeUpPage.bookMakeUpAppointment();
        waits(2);
    }




}
