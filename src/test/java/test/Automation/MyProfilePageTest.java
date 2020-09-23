package test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import page.Automation.LoginPage;
import page.Automation.MyProfilePage;
import org.testng.annotations.Test;
import java.util.Set;


public class MyProfilePageTest extends BasePageTest {

//    @BeforeClass
//    public void setUpClass() {
//        WebElement login = browser.findElement(By.cssSelector("a[class='list-your-business small w-hidden-medium lnkLogin']"));
//        login.click();
//        waits(2);
//        LoginPage loginPage = PageFactory.initElements(browser, LoginPage.class);
//        loginPage.doLogin();
//        waits(2);
//        WebElement profileLogo = browser.findElement(By.cssSelector("avatar-inital-inner-text loginUserIntials"));
//        profileLogo.click();
//        waits(2);
//        WebElement myProfile = browser.findElement(By.cssSelector("accprofile"));
//        myProfile.click();
//    }
   // @Test(priority = 3)
   @Test(enabled = false)
    public void updateProfileDetailsTest() {
        MyProfilePage profilePage = PageFactory.initElements(browser, MyProfilePage.class);
        profilePage.updateProfileDetails();
        waits(2);


    }

}
