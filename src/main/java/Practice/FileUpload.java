package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUpload {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Admin/Desktop/dragAndDrop.html");

        WebElement upload = driver.findElement(By.id("fileInput"));

        Thread.sleep(4000);

        upload.sendKeys("D:\\Amol\\1.png");




    }

}
