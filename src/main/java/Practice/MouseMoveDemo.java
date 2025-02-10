package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMoveDemo {

    @Test
    public void myTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        WebElement lnkMen = driver.findElement(By.xpath("//a[@data-group='men']"));

        Actions action = new Actions(driver);

        action.moveToElement(lnkMen).perform();



        WebElement jeans = driver.findElement(By.xpath("//a[text()='Jeans'][@href='/men-jeans']"));
        jeans.click();
    }

    @Test
    public void myTest2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        Actions action = new Actions(driver);
        WebElement menMenu = driver.findElement(By.xpath("//a[@data-group='men']"));
        action.moveToElement(menMenu).perform();
      /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement tShirtsOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(@href, '/men-tshirts')]")));
        tShirtsOption.click();
        driver.quit();*/
    }
}
