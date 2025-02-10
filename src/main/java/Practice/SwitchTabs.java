package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwitchTabs {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://facebook.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://google.com");


        ArrayList<String> windows = new ArrayList(driver.getWindowHandles());

        Thread.sleep(4000);
        driver.switchTo().window(windows.get(1));


        System.out.println(driver.getTitle());


    }
}
