package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.MailHomePage;
import pages.PasswordPage;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        gmaiLoginPage.setEmailAddress("test@gmail.com");
        gmaiLoginPage.clickNext();
        Thread.sleep(5000);
        passwordPage.setPassword("test");
        passwordPage.clickNext();
//        assertEquals(mailHomePage.getText(), "", "");
    }
}
