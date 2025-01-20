package regression.clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;


public class AddClientTest {

    WebDriver driver;

    @BeforeClass
    public void loginTest()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

         Login login = new Login(driver);

        login.setUsername("amolujagare@gmail.com");
        login.setPassword("admin123");
        login.clickLogin();

    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClientPage  = new AddClient(driver);

        String name = "John";
        String surname = "Doe";
        String address1 = "123 Main Street";
        String address2 = "Apt 4B";
        String city = "New York";
        String state = "NY";
        String zip = "10001";
        String phone = "1234567890";
        String fax = "0987654321";
        String mobile = "9876543210";
        String email = "john.doe@example.com";
        String web = "http://johndoe.com";
        String vatId = "VAT123456";
        String taxCode = "TAX789012";





        // Populate the client form
        addClientPage.setClientName(name);
        addClientPage.setClientSurname(surname);
        addClientPage.setLanguage("Thai");
        addClientPage.setStreetAddress1(address1);
        addClientPage.setStreetAddress2(address2);
        addClientPage.setCity(city);
        addClientPage.setState(state);
        addClientPage.setZipCode(zip);
        addClientPage.setCountry("Norway");
        addClientPage.setGender("Female");
        addClientPage.setBirthdate("09/01/2015");
        addClientPage.setPhoneNumber(phone);
        addClientPage.setFaxNumber(fax);
        addClientPage.setMobileNumber(mobile);
        addClientPage.setEmailAddress(email);
        addClientPage.setWebAddress(web);
        addClientPage.setVATID(vatId);
        addClientPage.setTaxesCode(taxCode);

        // Save the client details
      //  addClientPage.saveClient();

    }
}
