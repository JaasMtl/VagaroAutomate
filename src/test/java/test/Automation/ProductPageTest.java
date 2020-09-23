package test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.Automation.LoginPage;
import page.Automation.ProductPage;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.PageFactory;

public class ProductPageTest extends BasePageTest {

//    @BeforeClass
//    public void setClass() {
//        WebElement login = browser.findElement(By.cssSelector("a[class='list-your-business small w-hidden-medium lnkLogin']"));
//        login.click();
//        LoginPage loginPage = PageFactory.initElements(browser, LoginPage.class);
//        loginPage.doLogin();
//        WebElement profileLogo = browser.findElement(By.cssSelector("[class='avatar-inital-inner-text loginUserIntials']"));
//        profileLogo.click();
//        WebElement productHistory = browser.findElement(By.id("accproducts"));
//        productHistory.click();
//    }

   // @Test(enabled = false)
   // @Test(priority = 3)
    public void productTestCheck() throws InterruptedException {
        ProductPage productPage = PageFactory.initElements(browser,ProductPage.class);
        waits(2);
        productPage.checkProduct();
    }


}
