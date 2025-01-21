package regression.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;

import java.io.IOException;

import static util.ForDataProvider.getMyData;


public class AddClientDataProviderTest {

    WebDriver driver;

    @BeforeClass
    public void loginTest()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");//

         Login login = new Login(driver);

        login.setUsername("amolujagare@gmail.com");
        login.setPassword("admin123");
        login.clickLogin();

    }
    @Test(dataProvider = "getData")
    public void addClientTest(String name, String surname, String language, String address1, String address2, String city,
                              String state, String zip, String country, String gender, String birthdate,
                              String phone, String fax, String mobile
            , String email, String web, String vatId, String taxCode
            ,String expected,String xpathActual,String failureMSG) {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClientPage = new AddClient(driver);

        // Populate the client form with parameters
        addClientPage.setClientName(name);
        addClientPage.setClientSurname(surname);
        addClientPage.setLanguage(language);
        addClientPage.setStreetAddress1(address1);
        addClientPage.setStreetAddress2(address2);
        addClientPage.setCity(city);
        addClientPage.setState(state);
        addClientPage.setZipCode(zip);
        addClientPage.setCountry(country);
        addClientPage.setGender(gender);
        addClientPage.setBirthdate(birthdate);
        addClientPage.setPhoneNumber(phone);
        addClientPage.setFaxNumber(fax);
        addClientPage.setMobileNumber(mobile);
        addClientPage.setEmailAddress(email);
        addClientPage.setWebAddress(web);
        addClientPage.setVATID(vatId);
        addClientPage.setTaxesCode(taxCode);

        // Save the client details
        addClientPage.saveClient();

        String actual = "";

        try
        {
            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,failureMSG);
    }


    @DataProvider
    Object[][] getData() throws IOException {
      return   getMyData("Data/Client_Data.xlsx","Sheet1");
    }
}
