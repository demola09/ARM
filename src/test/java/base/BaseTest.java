package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.GmaiLoginPage;
import pages.MailHomePage;
import pages.PasswordPage;

public class BaseTest {
    private WebDriver driver;
    protected GmaiLoginPage gmaiLoginPage;
    protected MailHomePage mailHomePage;
    protected PasswordPage passwordPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gmail.com/");

        gmaiLoginPage = new GmaiLoginPage(driver);
        passwordPage = new PasswordPage(driver);
        mailHomePage = new MailHomePage(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
