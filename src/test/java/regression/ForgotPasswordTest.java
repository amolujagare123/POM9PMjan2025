package regression;

import Utility.OpenURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;

public class ForgotPasswordTest extends OpenURL {

    @Test
    public void forgotPasswordTest()
    {


        Login login = new Login(driver);
        login.clickForgotPassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.setEmail("amol@gmail.com");
        forgotPassword.clickReset();

    }
}
