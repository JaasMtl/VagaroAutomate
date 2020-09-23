package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Automation.FooterPage;


public class FooterPageTest extends BasePageTest {
    @Test(enabled = false)
    //@Test(priority = 2)
    public void footerLinks() {
        FooterPage pageFooter = PageFactory.initElements(browser, FooterPage.class);
        pageFooter.footerLinks();
        waits(2);
        //  pageFooter.clickOnFacebookSocialMedia("Facebook");
    }
}

