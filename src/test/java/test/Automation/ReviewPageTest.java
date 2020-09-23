package test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.Automation.LoginPage;
import page.Automation.ReviewPage;

public class ReviewPageTest extends BasePageTest {

//    @BeforeClass
//    public void setUpClass(){
//        WebElement login = browser.findElement(By.cssSelector("a[class='list-your-business small w-hidden-medium lnkLogin']"));
//        login.click();
//        LoginPage loginPage = PageFactory.initElements(browser,LoginPage.class);
//        loginPage.doLogin();
//        WebElement profileLogo = browser.findElement(By.cssSelector("[class='avatar-inital-inner-text loginUserIntials']"));
//        profileLogo.click();
//        WebElement myProfile = browser.findElement(By.id("accreviews"));
//        myProfile.click();
//    }
    //@Test(priority = 3)
   @Test(enabled = false)
    public void reviewDetailsTest() {
        ReviewPage reviewPage = PageFactory.initElements(browser,ReviewPage.class);
        waits(2);
        reviewPage.checkReviewPage();

    }
}
