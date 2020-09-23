package test.Automation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Automation.GalleryPage;

public class GalleryTest extends BasePageTest {

    @Test(enabled = false)
   // @Test(priority = 3)
    public void checkGalleryFilter(){
        GalleryPage galleryPage = PageFactory.initElements(browser,GalleryPage.class);
        galleryPage.galleryFilter();
        waits(2);
    }
}
