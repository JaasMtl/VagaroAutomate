package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InvoicesPage extends BasePage {

    public InvoicesPage(WebDriver driver) {
         super(driver);
    }

    @FindBy(css= "div.avatar-inital-inner-text.loginUserIntials")
    protected WebElement userProfileIcon;

    @FindBy(id = "myaccountivoices")
    protected WebElement invoices;

    @FindBy(id = "aMyInvoicePaidTab")
    protected WebElement paidInvoice;


public void checkInvoice(){
    userProfileIcon.click();
    invoices.click();
    Select history = new Select(invoices);
    history.selectByVisibleText("Invoices");
    paidInvoice.click();

}
}