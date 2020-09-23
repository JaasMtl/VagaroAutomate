package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class FitnessPage extends BasePage {

//
//    @FindBy(id = "fitness-option")
//    protected WebElement fitness;

    @FindBy(id = "s2id_autogen3")
    protected WebElement searchByCity;

    @FindBy(id="s2id_autogen4")
    protected WebElement searchByService;

    @FindBy(css = "#txtHomeServicesDate_picker > div.xdsoft_datepicker.active > div.xdsoft_calendar > table > tbody > tr:nth-child(4) > td.xdsoft_date.xdsoft_day_of_week3.xdsoft_date")
    protected WebElement selectDate;

    @FindBy(css = "#txtHomeServicesDate_picker > div.xdsoft_timepicker.active > div.xdsoft_time_box.xdsoft_scroller_box > div.xdsoft_time_variant > div.xdsoft_time.xdsoft_current")
    protected WebElement selectTime;

    @FindBy(css = "xdsoft_save_button w-button-primary w-button border-radius3px")
    protected WebElement okButton;

    @FindBy(id ="btnSearchBuss")
    protected WebElement clickSearch;

    public FitnessPage(WebDriver driver) {
        super(driver);
    }

    public void checkFitness() {

        //fitness.click();
        searchByCity.sendKeys("Montreal, QC, Canada");
        searchByService.sendKeys("Makeup - Application");

        selectDate.click();
        Select date = new Select(selectDate);   //fix later
        date.selectByValue("28");

        selectTime.click();
        Select time = new Select(selectDate);    //fix later
        time.selectByValue("8:00 PM");

        okButton.click();

        // country.selectByValue("8:00 PM");

        clickSearch.click();
    }

    public String getTitle() {

        return browser.getTitle();
    }
}