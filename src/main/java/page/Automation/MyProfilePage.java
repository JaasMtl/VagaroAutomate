package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends BasePage {

    public MyProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "txtFName")
    protected WebElement firstName;

    @FindBy(id = "txtLName")
    protected WebElement lastName;

    @FindBy(id = "txtEmail")
    protected WebElement eMail;

    @FindBy(id = "txtUsername")
    protected WebElement userName;

    @FindBy(css = "div:nth-child(1) > div > ul > li.canada-f")
    protected WebElement selectCountryDropDown;

    @FindBy(id = "s2id_autogen2")
    protected WebElement address;

    @FindBy(id = "#txtSuite")
    protected WebElement addAptSuit;

    @FindBy(id = "txtCell")
    protected WebElement mobileNumber;

    @FindBy(id = "txtNightPhone")
    protected WebElement nightPhone;

    @FindBy(id = "txtDayPhone")
    protected WebElement dayPhone;

    @FindBy(id = "ddlGender")
    protected WebElement genderDropDown;

    @FindBy(css = "#cboMonth > option:nth-child(10)")
    protected WebElement birthMonthDropDown;

    @FindBy(css= "#cboDay > option:nth-child(28)")
    protected WebElement birthDateDropDown;

    @FindBy(css= "d#cboYear > option:nth-child(94)")
    protected WebElement birthYearDropDown;

    @FindBy(id = "hidNotificationtype")
    protected WebElement appointmentReminder;

    @FindBy(css = "div:nth-child(2) > div.tabs.w-tabs > div > a.switch-tab.w-inline-block.on-class")
    protected WebElement promotionalEmails;

    @FindBy(className = "switch-tab w-inline-block on-class")
    protected WebElement vaGAROEmails;

    @FindBy(id = "btnSave")
    protected WebElement saveButton;

    public void updateProfileDetails()  {

        firstName.sendKeys("Rose");
        lastName.sendKeys("Lisa");
        eMail.sendKeys("lisarossy21@gmail.com");
        userName.sendKeys("LisaRose12");

        selectCountryDropDown.click();
        Select country = new Select(selectCountryDropDown);
        country.selectByVisibleText("Canada");

        address.sendKeys("rue police");
        addAptSuit.sendKeys("1234");
        mobileNumber.sendKeys("5437438329");
        nightPhone.sendKeys("3428392382");
        dayPhone.sendKeys("4353672897");
        genderDropDown.click();
        Select gender = new Select( genderDropDown);
        gender.selectByVisibleText("Female");

        birthDateDropDown.click();
        Select date = new Select(birthDateDropDown);
        date.selectByVisibleText("27");

        birthMonthDropDown.click();
        Select month = new Select(birthMonthDropDown);
        month.selectByVisibleText("sep");

        birthYearDropDown.click();
        Select year = new Select(birthYearDropDown);
        year.selectByVisibleText("1992");

        appointmentReminder.click();
        promotionalEmails.click();
        vaGAROEmails.click();
        saveButton.click();
    }
    public String getTitle() {

        return browser.getTitle();
    }


}
