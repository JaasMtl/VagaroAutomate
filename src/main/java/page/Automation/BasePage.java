package page.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage  {

  //  protected static  final Logger Log = LoggerFactory.getLogger((BasePage.class));
    protected WebDriver browser;
    protected WebDriverWait wdWait;
    protected JavascriptExecutor jse;
    protected Actions mkActions;

    public BasePage(WebDriver driver) {
        System.out.println("We are in BasePage constructor");
        browser = driver;
        wdWait = new WebDriverWait(browser, 30);
        jse = (JavascriptExecutor) browser;
        mkActions = new Actions(browser);
    }

    public static void waits(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("program init");
        }
    }

    public String getTitle() {

        return browser.getTitle();
    }

    public String getUrl() {

        return browser.getCurrentUrl();
    }
//    public void refreshPage(){
//        browser.navigate().refresh();
//    }

    public void scrollIntoViewUsingElement(WebElement element) {
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

    public void explicitWaitById(String id) {
        wdWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(id)));
    }

    public void explicitWaitByCssSelector(String cssSelector) {
        wdWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(cssSelector)));
    }
}
