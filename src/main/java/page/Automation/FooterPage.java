package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FooterPage extends BasePage {

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "section.float-right.footer-25-div > a:nth-child(2)")
    protected WebElement about;

    @FindBy(css = "section.float-right.footer-25-div > a:nth-child(3)")
    protected WebElement listYourBusiness;

    @FindBy(css = "section.float-right.footer-25-div > a:nth-child(4)")
    protected WebElement vaGaRoBlog;

    @FindBy(css = "section.float-right.footer-25-div > a:nth-child(5)")
    protected WebElement careers;

    @FindBy(css = "section.float-right.footer-25-div > a:nth-child(6)")
    protected WebElement support;

    @FindBy(id = "dailyDealsFooter")
    protected WebElement dailyDeals;

    @FindBy(css = "section.discover.footer-25-div > a:nth-child(3)")
    protected WebElement userAgreement;

    @FindBy(css = "section.discover.footer-25-div > a:nth-child(4)")
    protected WebElement privacyPolicy;

    @FindBy(css = "section.discover.footer-25-div > a:nth-child(6)")
    protected WebElement GDPR;

    @FindBy(css = "section.discover.footer-25-div > a:nth-child(7)")
    protected WebElement contact;

    public void footerLinks() {

        about.click();
        browser.navigate().to("https://www.vagaro.com");
        waits(2);
        listYourBusiness.click();
        browser.navigate().to("https://www.vagaro.com");
        waits(2);
        vaGaRoBlog.click();
        browser.navigate().to("https://www.vagaro.com");
        careers.click();
        browser.navigate().to("https://www.vagaro.com");
        waits(2);
        support.click();
        browser.navigate().to("https://www.vagaro.com");
        waits(2);
        dailyDeals.click();
        browser.navigate().to("https://www.vagaro.com");
        waits(2);
        userAgreement.click();
        browser.navigate().to("https://www.vagaro.com");
        waits(2);
        privacyPolicy.click();
        browser.navigate().to("https://www.vagaro.com");
        waits(2);
        GDPR.click();
        browser.navigate().to("https://www.vagaro.com");
        waits(2);
        contact.click();

    }

    public void scrollIntoViewUsingElement(WebElement element) {

        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

    public String getTitle() {

        return browser.getTitle();
    }

}