package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Automation.LoginPage;

public class LoginTest extends BasePageTest {

   @Test(enabled = false)
     // @Test(priority = 2)
    public void enterLoginDetails() {
          waits(2);
        LoginPage pageLogin = PageFactory.initElements(browser, LoginPage.class);
        pageLogin.doLogin();
        waits(2);

    }
}


