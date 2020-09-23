package test.Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Automation.*;
import utils.PropertyFilesUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.net.URL;


public class BasePageTest {

   //protected static final Logger Log = LoggerFactory.getLogger(BasePageTest.class);
    protected static WebDriver browser;
    protected WebDriverWait wdWait;


    @BeforeTest
    public void setUp() throws IOException {
        PropertyFilesUtils.initializeBrowserProperties();
        if (PropertyFilesUtils.getTestRunLocation().equalsIgnoreCase("BrowserStack")) {
            String AUTOMATE_USERNAME = "bunnybetty1";
            String AUTOMATE_ACCESS_KEY = "MXue3zTDgvHoKqMwatkp";
            String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
                    + "@hub-cloud.browserstack.com/wd/hub";
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os_version", "Catalina");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "81");
            caps.setCapability("os", "OS X");
            browser = new RemoteWebDriver(new URL(URL), caps);

        } else if (PropertyFilesUtils.getTestRunLocation().equalsIgnoreCase("SauceLabs")) {
            //add code according to Sauce Labs
            String AUTOMATE_USERNAME = "bunnybetty1";
            String AUTOMATE_ACCESS_KEY = "MXue3zTDgvHoKqMwatkp";
            String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
                    + "@hub-cloud.browserstack.com/wd/hub";
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platfromName", "macOs 10:15");
            caps.setCapability("browserName", "chrome");
            caps.setCapability("browserVersion", "86.0 beta");
            browser = new RemoteWebDriver(new URL(URL), caps);
        } else if (PropertyFilesUtils.getTestRunLocation().equalsIgnoreCase("Local")) {
            if (PropertyFilesUtils.getBrowser().equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                browser = new ChromeDriver();

            } else if (browser == null) {
                System.out.println("broswer can not be null . something is wrong");
                System.exit(1);
            }
        } else {
            System.out.println("location is not defined in BroswerConfig.proopertiesFile and"
                    + " may be the function is not defined in PropertyFileUtils.java file in Utils folder");
        }

        browser.get("https://www.vagaro.com");
        browser.manage().window().maximize(); // maximize the window
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // load the web elements
        wdWait = new WebDriverWait(browser, 30);

        LandingPage landingPage = PageFactory.initElements(browser, LandingPage.class);
        landingPage.logLandingOn();
        waits(2);

//        LoginPage loginPage = PageFactory.initElements(browser, LoginPage.class);
//        loginPage.doLogin();
//        waits(2);

//        InvoicesPage invoicesPage = PageFactory.initElements(browser,InvoicesPage.class);
//        invoicesPage.checkInvoice();
//        waits(2);
//
//        PopularInMontrealPage popularInMontrealPage = PageFactory.initElements(browser,PopularInMontrealPage.class);
//        popularInMontrealPage.checkServices();
//        waits(2);

//        MyProfilePage profilePage = PageFactory.initElements(browser, MyProfilePage.class);
//        profilePage.updateProfileDetails();
//        waits(2);

//        ProductPage productPage = PageFactory.initElements(browser,ProductPage.class);
//        productPage.checkProduct();
//        waits(2);

//        FitnessPage fitnessPage = PageFactory.initElements(browser, FitnessPage.class);
//        fitnessPage.checkFitness();
//        waits(2);

//        MakeUpPage makeUpPage = PageFactory.initElements(browser,MakeUpPage.class);
//        makeUpPage.bookMakeUpAppointment();
//        waits(2);

//        ReviewPage reviewPage = PageFactory.initElements(browser,ReviewPage.class);
//        reviewPage.checkReviewPage();
//        waits(2);
    }
    protected static void waits(int seconds) {
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                System.out.println("error occur");
            }
        }
        @AfterTest(enabled = false)
        public void closeBrowser() {
            //browser.close();
            System.out.println("close the browser");
        }
    }
