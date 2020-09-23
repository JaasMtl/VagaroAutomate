package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GalleryPage extends BasePage {

    public GalleryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "photos")
    protected WebElement gallery;

    @FindBy(css= "#divFilterSection > div > a")
    protected WebElement filter;

    @FindBy(id = "aCategory_102")
    protected WebElement makeup;

    @FindBy(id = "lblInnerStyleCategory_35")
    protected WebElement adult;

    @FindBy(id = "lblInnerStyleCategory_32")
    protected WebElement female;

    @FindBy(id = "lblInnerStyleCategory_89")
    protected WebElement eye;

    @FindBy(id = "lblInnerStyleCategory_76")
    protected WebElement eyelashes;

    @FindBy(css = "#divGalleryFilterContent > div > div.filters-button-div > a.go-btn.w-button")
    protected WebElement applyFilter;


    public void galleryFilter() {
        gallery.click();
        filter.click();
        makeup.click();
        adult.click();
        female.click();
        eye.click();
        eyelashes.click();
        applyFilter.click();

 }
    public String getTitle() {

        return browser.getTitle();
    }
}