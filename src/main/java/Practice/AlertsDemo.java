package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDemo {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

     //   WebElement clickButton = driver.findElement(By.xpath("//*[@type='button']"));
        WebElement tryItButton = driver.findElement(By.xpath("//*[text()='Try it']"));

     //   clickButton.click();

        tryItButton.click();

        Thread.sleep(4000);

        Alert alert = driver.switchTo().alert();
       // alert.accept();
        System.out.println(alert.getText());
        alert.dismiss();

    }
    }
