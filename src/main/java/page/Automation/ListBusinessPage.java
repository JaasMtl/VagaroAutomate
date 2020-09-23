package page.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

public class ListBusinessPage extends BasePage {

    //protected static String ListYourBusiness;
    public ListBusinessPage(WebDriver driver) {
        super(driver);
    }
    public  void hoverOperation() {
        System.out.println("we are in hover");
//        String main_window=browser.getWindowHandle();
//        Set<String> allwindowhandles=browser.getWindowHandles();
//        for(String child: allwindowhandles) {
//            if(!main_window.equalsIgnoreCase(child)) {
//                browser.switchTo().window(child);
//            }
//        }
        WebElement list = browser.findElement(By.cssSelector("div.mid-nav > div:nth-child(1) > div:nth-child(2)"));
        Actions hover = new Actions(browser);
        hover.moveToElement(list).build().perform();
        browser.findElement(By.linkText("Coaching")).click();
    }

//
//    @FindBy(css = ("body > div:nth-child(1) > div.new-nav-bar > div.nav-bar > div.mid-nav > div:nth-child(1) > div:nth-child(2)"))
//    protected WebElement businessType;
//
//    @FindBy(css = "div.feature-dropdown-parent.auto.hide > div.div-block-5049 > div:nth-child(2) > a:nth-child(2) > div:nth-child(2)")
//    protected WebElement coaching;


//    public void enterBusinessDetails(){
//        businessType.click();
//        coaching.click();
//}
    public String getTitle() {
        return browser.getTitle();
    }
}