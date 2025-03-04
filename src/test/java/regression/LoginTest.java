package regression;

import Utility.OpenURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;

import static Utility.Reader.getPassword;
import static Utility.Reader.getUsername;

public class LoginTest extends OpenURL {

    @Test
    public void loginTest()
    {

        Login login = new Login(driver);

        login.setUsername(getUsername());
        login.setPassword(getPassword());
        login.clickLogin();

    }
}
