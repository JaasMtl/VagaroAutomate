package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Automation.ListBusinessPage;

public class ListBusinessPageTest extends BasePageTest {

    // @Test(priority = 2)
    @Test(enabled = false)
    public void CheckBusinessDetails(){
        ListBusinessPage listBusinessPage = PageFactory.initElements(browser,ListBusinessPage.class);
        waits(2);
        listBusinessPage.hoverOperation();  // work around
        waits(10);
    }
}
