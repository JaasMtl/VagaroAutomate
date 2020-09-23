package page.Automation;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AppointmentPage extends BasePage {

    public AppointmentPage(WebDriver driver) {

        super(driver);
    }
//        @FindBy(id = "txtUsernameP")
//    protected WebElement email;
//
//    @FindBy(id = "txtPasswordP")
//    protected WebElement password;
//
//    @FindBy(css = "div.checkbox-custom-black.small.login-remember")
//    protected WebElement rememberMe;
//
//    @FindBy(id = "#recaptcha-anchor")
//    protected WebElement imNotARobot;
//
//    @FindBy(id = "btLogin")
//    protected WebElement login;


    @FindBy(css = "#divUserPhoto > div > div > div")           // appointment page
    protected WebElement userLogInIcon;

    @FindBy(id = "#accappointments")
    protected WebElement appointments;

    @FindBy(css = "div[id='divMyAppointments']")
    protected List<WebElement> myAppointments;


    public void checkAppointment() throws InterruptedException {

        userLogInIcon.click();
        appointments.click();
        myAppointments.get(1).click();
    }
    public String getTitle() {

        return browser.getTitle();
    }

}





