package page.Automation;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage extends BasePage {

//    @FindBy(css = "#custrightnav > a.list-your-business.small.w-hidden-medium.lnkLogin")
//    protected WebElement login;

//    @FindBy(css= "div.avatar-inital-inner-text.loginUserIntials")
//    protected WebElement userProfileIcon;

//    @FindBy(id = "fitness-option")
//    protected WebElement fitness;

//    @FindBy(id= "aSeeAllLiveStream")
//    protected WebElement seeAll;

    @FindBy(css = "#popular-beauty-cat-row > a:nth-child(7)")
    protected WebElement makeUp;

//    @FindBy(css = "#footerdiv > div.normal-footer > div.footer-div.w-clearfix > section.footer-25-div.footer-end > a")
//    protected WebElement listBusiness;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void logLandingOn() {
       // login.click();
      //  userProfileIcon.click();
        //seeAll.click();
        //fitness.click();
        makeUp.click();
      // listBusiness.click();
    }


//    public void pageProfessionalOn() {
//
//        professional.click();
//    }

    public String getTitle() {
        return browser.getTitle();
    }
}
