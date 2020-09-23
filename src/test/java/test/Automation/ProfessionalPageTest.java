package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Automation.ProfessionalPage;
public class ProfessionalPageTest extends BasePageTest {

   // @Test(enabled = false)
    public void checkProfessionPage(){
     ProfessionalPage professionalPage = PageFactory.initElements(browser,ProfessionalPage.class);
     waits(2);
     professionalPage.pageProfessionalOn();
    }




}
