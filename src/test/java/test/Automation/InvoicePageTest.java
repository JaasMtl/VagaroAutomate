package test.Automation;

import page.Automation.InvoicesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InvoicePageTest extends BasePageTest{

   // @Test(priority = 3)
    public void invoiceTest(){
        InvoicesPage invoicesPage = PageFactory.initElements(browser,InvoicesPage.class);
        invoicesPage.checkInvoice();
        waits(2);
    }
}