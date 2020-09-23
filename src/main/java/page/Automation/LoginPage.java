package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        System.out.println("We are in consturctor");
    }
    @FindBy(id = "txtUsernameP")
    protected WebElement email;

    @FindBy(id = "txtPasswordP")
    protected WebElement password;

    @FindBy(css = "div.checkbox-custom-black.small.login-remember")
    protected WebElement rememberMe;

    @FindBy(css = "recaptcha-anchor-label")
    protected WebElement imNotARobot;

    @FindBy(id = "btLogin")
    protected WebElement loginButton;

    public void doLogin() {
            email.sendKeys("john.mird+2@gmail.com");
            password.sendKeys("12341234Aa");
            rememberMe.click();
            // imNotARobot.click();
            loginButton.click();
    }
//    public void fillDetails(String email, String password) {
//        this.email.sendKeys(email);
//        this.password.sendKeys(password);
//        loginButton.click();
//    }

    public String getTitle() {

        return browser.getTitle();
    }
}