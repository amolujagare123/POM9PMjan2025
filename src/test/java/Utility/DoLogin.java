package Utility;

import org.testng.annotations.BeforeClass;
import pages.Login;

import static Utility.Reader.getPassword;
import static Utility.Reader.getUsername;

public class DoLogin extends OpenURL {

    @BeforeClass
    public void doLogin()
    {
        Login login = new Login(driver);
        login.setUsername(getUsername());
        login.setPassword(getPassword());
        login.clickLogin();
    }
}
