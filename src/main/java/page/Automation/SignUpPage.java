package page.Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;


public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver) {

        super(driver);
    }

//    @FindBy(css = "#custrightnav > a.list-your-business.small.w-hidden-medium.lnkLogin")
//    protected WebElement login;

//    @FindBy(id = "lnkRegister")
//    protected WebElement signUpNow;

    @FindBy(id = "txtFirstname")
    protected WebElement firstName;

    @FindBy(id = "txtLastname")
    protected WebElement lastName;

    @FindBy(id = "cboContact")
    protected WebElement selectCell;

    @FindBy(id = "txtCell")
    protected WebElement phoneNumber;

    @FindBy(id = "txtEmail")
    protected WebElement email;

    @FindBy(id = "txtRPassword")
    protected WebElement password;

    @FindBy(css = "#ddlGender > option:nth-child(3)")
    protected WebElement gender;

    @FindBy(css = "a.long.switch-tab.w-inline-block.w-tab-link.aemail.bothtext > div")
    protected WebElement appointmentReminder;

    @FindBy(css = "a.long.switch-tab.w-inline-block.w-tab-link.bnone.w--current")
    protected WebElement promotionalEmail;

    @FindBy(css = "div.recaptcha-checkbox-checkmark")
    protected WebElement robotButton;

    @FindBy(id = "btnRegister")
    protected WebElement createAccount;

    //  @FindBy(id= )
    // protected WebElement Continue;

    public void enterDetails() throws InterruptedException {
        browser.switchTo().frame("iFrameSignUp");
        firstName.sendKeys("Rose");
        lastName.sendKeys("Leen");
        selectCell.click();
        phoneNumber.sendKeys("838-292-2912");
        email.sendKeys("leenrose@gmail.com");
        password.sendKeys("Canada1992$");
        gender.click();
        appointmentReminder.click();
        promotionalEmail.click();
        robotButton.click();
        createAccount.click();
    }
    public String getTitle() {

        return browser.getTitle();
    }
}


