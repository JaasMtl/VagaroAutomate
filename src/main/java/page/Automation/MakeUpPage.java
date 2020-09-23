package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeUpPage extends BasePage {

//    @FindBy(id = "btnAtBusiness")
//    protected WebElement atBusiness;

    @FindBy(id = "ancFilter")
    protected WebElement filter;

    @FindBy(id = "HairSalon")
    protected WebElement businessType;

    @FindBy(id = "WiFiAccess49")
    protected WebElement amenities;

    @FindBy(id = "Cash")
    protected WebElement payment;

    @FindBy(id = "divAdBusiness")
    protected WebElement onBusiness;

   @FindBy(id = "#AdvanceFilterContent > div > div.filters-button-div > a.go-btn.w-button")
   protected WebElement applyFilter;


//    @FindBy(css = "input#s2id_autogen5.select2-input")
//    protected WebElement searchServiceClass;

    public MakeUpPage(WebDriver driver) {
        super(driver);
    }

    public void bookMakeUpAppointment() {
       // atBusiness.click();
        filter.click();
        waits(1);
        businessType.click();
        waits(1);
        amenities.click();
        waits(1);
        payment.click();
        waits(1);
        onBusiness.click();
        applyFilter.click();
        //searchServiceClass.sendKeys("Women's Haircut");
    }
    public void scrollIntoViewUsingElement(WebElement element) {

        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

}