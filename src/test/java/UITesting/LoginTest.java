package UITesting;

import Utility.OpenURL;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;

import static Utility.uiTestUtil.UITest.*;

public class LoginTest extends OpenURL {
    Login login;
    
    @BeforeClass
    public void initLogin()
    {
        login = new Login(driver);
    }
    
    @Test
    public void txtUsernameVisibility()
    {
        boolean expected = true;
        boolean actual = false;
        try {
             actual = login.txtUsername.isDisplayed();
        }
        catch (Exception e)
        {
            
        }
        Assert.assertEquals(actual,expected,"element not visible");
    }

    @Test
    public void txtUsernameVisibility2()
    {
        boolean expected = true;
        boolean actual = getVisibility(login.txtUsername);
        Assert.assertEquals(actual,expected,"element not visible");
    }

    @Test
    public void txtPasswordVisibility()
    {
        boolean expected = true;
        boolean actual = getVisibility(login.txtPassword);
        Assert.assertEquals(actual,expected,"element not visible");
    }

    @Test
    public void txtUsernameEnability()
    {
        boolean expected = true;
        boolean actual = getEnability(login.txtUsername);
        Assert.assertEquals(actual,expected,"element not enabled");
    }

    @Test
    public void lblEmailSpellCheck()
    {
        String expected = "Email";
        String actual = getElementText(login.lblEmail);
        Assert.assertEquals(actual,expected,"incorrect spelling");
    }

    @Test
    public void txtPasswordWatermark()
    {
        String expected = "Password";
        String actual = getPlaceholderText(login.txtPassword);
        Assert.assertEquals(actual,expected,"incorrect watermark");
    }

    @Test
    public void lblEmailFontSize()
    {
        String expected = "14px";
        String actual = getElementCSS(login.lblEmail,"font-size");
        Assert.assertEquals(actual,expected,"incorrect Font Size");
    }

    @Test
    public void lblEmailFontFamily()
    {
        String expected = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = getElementCSS(login.lblEmail,"font-family");
        Assert.assertEquals(actual,expected,"incorrect Font Family");
    }

    @Test
    public void btnLoginColor()
    {
        String expected = "#2C8EDD";
        String elementColor = getElementCSS(login.btnLogin,"background-color");

        String actual = Color.fromString(elementColor).asHex().toUpperCase();
        
        Assert.assertEquals(actual,expected,"incorrect Color");
    }


    @Test
    public void btnLoginHoverColor()
    {
        String expected = "#1e73b8";
        // move to element - btnLogin

        Actions action = new Actions(driver);
        action.moveToElement(login.btnLogin).perform();


        String elementColor = getElementCSS(login.btnLogin,"background-color");

        String actual = Color.fromString(elementColor).asHex();

        Assert.assertEquals(actual,expected,"incorrect Color");
    }
    
}
