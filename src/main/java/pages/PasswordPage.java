package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MailHomePage;

public class PasswordPage {

    private WebDriver driver;
    private By passwordField = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    private By nextButton = By.xpath("//span[normalize-space()='Next']");

    public PasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public MailHomePage clickNext(){
        driver.findElement(nextButton).click();
        return new MailHomePage(driver);
    }
}
