package test.Automation;

import org.openqa.selenium.support.PageFactory;
import page.Automation.PopularInMontrealPage;
import org.testng.annotations.Test;

public class PopularMontrealTest extends BasePageTest{

      // @Test(priority = 3)
       public void seeAllServices(){
       PopularInMontrealPage popularInMontrealPage = PageFactory.initElements(browser,PopularInMontrealPage.class);
       popularInMontrealPage.checkServices();
       waits(2);
    }

}
