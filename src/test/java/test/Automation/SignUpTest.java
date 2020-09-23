package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Automation.SignUpPage;

public class SignUpTest extends BasePageTest {

    @Test(enabled=false)
    public void signUpForAccount() throws InterruptedException {
        SignUpPage  pageSignUp = PageFactory.initElements(browser, SignUpPage .class);
        waits(2);
      //pageSignUp.clickLogin();
        pageSignUp.enterDetails();
    }
}

