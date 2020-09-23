package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DailyDealsPage extends BasePage {

    public DailyDealsPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(id = "deals")
    protected WebElement dailyDeals;

    @FindBy(css = "aSortOption_5")
    protected WebElement nearest;

    @FindBy(id = "spnusageLeft")
    protected WebElement soldSale;

    @FindBy(css = "select2-result-label-19")
    protected WebElement selectServices;

    //@FindBy(css = "div.xdsoft_calendar > table tr:nth-child(4)")

    @FindBy(css = "#txtServiceDateWeb_picker > div.xdsoft_datepicker.active > div.xdsoft_calendar > table > tbody > tr:nth-child(3) > td.xdsoft_date.xdsoft_day_of_week3.xdsoft_date")
    protected WebElement selectDate;

    @FindBy(id = "ctl00_btnbookService")
    protected WebElement book;

    public void getDailyDeals() throws InterruptedException{

        dailyDeals.click();

        nearest.click();
        Select nearBy = new Select(nearest);
        nearBy.selectByVisibleText("Nearest");

        soldSale.click();

        selectServices.click();
        Select services = new Select(selectServices);
        services.selectByVisibleText("Micropigmentation");

        selectDate.click();
        Select date = new Select(selectDate);
        date.deselectByValue("Sep 13,2020");

        book.click();
    }
    public String getTitle() {

        return browser.getTitle();
    }
}