package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmaiLoginPage {

    private WebDriver driver;

    private By emailsAddressField = By.xpath("//input[@id='identifierId']");
    private By nextButton = By.xpath("//span[normalize-space()='Next']");

    public GmaiLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailAddress(String emailID){
        driver.findElement(emailsAddressField).sendKeys(emailID);
    }

    public PasswordPage clickNext(){
        driver.findElement(nextButton).click();
        return new PasswordPage(driver);
    }
}
