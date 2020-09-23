package page.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
//
//    @FindBy(css =("a[class='list-your-business small w-hidden-medium lnkLogin']"))
//    protected WebElement myLogo;

    @FindBy(id ="accproducts")
   protected WebElement products;

    @FindBy(id ="pendingOrderTab")
    protected WebElement pendingOrder;

    @FindBy(id ="historyOrderTab")
    protected WebElement orderHistory;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void checkProduct() {
        //myLogo.click();
      products.click();
      pendingOrder.click();
      orderHistory.click();

}
    public String getTitle() {

        return browser.getTitle();
    }
}