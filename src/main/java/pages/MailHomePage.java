package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailHomePage {
    private WebDriver driver;
    private By composeMail = By.xpath("//div[contains(text(),'Compose')]");
    private By recipientAddress = By.xpath("//textarea[@id=':ru']");
    private By emailSubject = By.xpath("//input[@id=':rc']");
    private By emailBody = By.xpath("//div[@id=':si']");
    private By sendButton = By.xpath("//div[@id=':r2']");

    public MailHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setComposeMail(){
        driver.findElement(composeMail).click();
    }

    public void setRecipientAddress(String address){
        driver.findElement(recipientAddress).sendKeys(address);
    }

    public void setEmailSubject(String subject){
        driver.findElement(emailSubject).sendKeys(subject);
    }

    public void setEmailBody(String body){
        driver.findElement(emailBody).sendKeys(body);
    }

    public void clickSendButton(){
        driver.findElement(sendButton).click();
    }
}
