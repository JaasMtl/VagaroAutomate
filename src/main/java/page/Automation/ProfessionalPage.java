package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfessionalPage extends BasePage {



    @FindBy(id = "professionals")
    protected WebElement professional;

    @FindBy(id = "txtServiceProviderPublicpage")
    protected WebElement searchProfName;

    @FindBy(id = "aSearchStylist")
    protected WebElement go;

    @FindBy(id = "ancFilter")
    protected WebElement filter;

    @FindBy(css = "#divBusinessType > div:nth-child(10) > div")
    protected WebElement businessType;

    @FindBy(css = "#divEstablishment > div:nth-child(3) > div")
    protected WebElement amenities;

    @FindBy(css = "#divLanguage > div.filters-checkbox.filters-first > div")
    protected WebElement language;

    @FindBy(css = "#divPayment > div.filters-checkbox.filters-first > div")
    protected WebElement payment;

    @FindBy(css = "#divAdBusiness > div")
    protected WebElement atBusiness;

    public ProfessionalPage(WebDriver driver) {
        super(driver);
    }

    public void pageProfessionalOn() {

        professional.click();
        waits(2);
        searchProfName.sendKeys("Lisa Swiss");
        go.click();
        waits(1);
        filter.click();
        businessType.click();
        amenities.click();
        language.click();
        payment.click();
        atBusiness.click();
    }
}