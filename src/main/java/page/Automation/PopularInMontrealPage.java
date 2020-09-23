package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopularInMontrealPage extends BasePage {

    @FindBy(id= "aSeeAllLiveStream")
    protected WebElement seeAll;


    @FindBy(id = "LiveStreamyoga")
    protected WebElement yoga;

    public PopularInMontrealPage(WebDriver driver) {
        super(driver);
    }
    public void checkServices() {
        seeAll.click();
        yoga.click();
    }
}