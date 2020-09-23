package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage {

    @FindBy(id = "accreviews")
    protected WebElement review;

    public void checkReviewPage() {
        review.click();
        waits(2);
    }
    public ReviewPage (WebDriver driver) {
        super(driver);
    }

}
