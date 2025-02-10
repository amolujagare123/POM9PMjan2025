package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropemo1 {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Admin/Desktop/dragAndDrop.html");

        WebElement source = driver.findElement(By.id("box3"));
        WebElement target = driver.findElement(By.className("dropzone"));

        Actions action = new Actions(driver);

        Thread.sleep(4000);

        action.dragAndDrop(source,target).perform();



    }

}
