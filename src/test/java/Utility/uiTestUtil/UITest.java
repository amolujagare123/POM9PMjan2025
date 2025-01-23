package Utility.uiTestUtil;

import org.openqa.selenium.WebElement;

public class UITest {

    public static boolean getVisibility(WebElement element)
    {
        boolean result = false;
        try {
            result = element.isDisplayed();
        }
        catch (Exception e)
        {

        }

        return result;
    }

    public static boolean getEnability(WebElement element)
    {
        boolean result = false;
        try {
            result = element.isEnabled();
        }
        catch (Exception e)
        {

        }

        return result;
    }

    public static String getElementText(WebElement element)
    {
        String result = "";
        try {
            result =   element.getText();
        }
        catch (Exception e)
        {

        }
      return result;
    }

    public static String getPlaceholderText(WebElement element)
    {
        String result = "";
        try {
            result =   element.getDomAttribute("placeholder");
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String getElementCSS(WebElement element,String cssProperty)
    {
        String result = "";
        try {
            result =   element.getCssValue(cssProperty);
        }
        catch (Exception e)
        {

        }
        return result;
    }
}
