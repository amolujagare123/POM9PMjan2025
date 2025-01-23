package DBTesting.Clients;

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
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

import static Utility.Conversion.*;
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
            , String email, String web, String vatId, String taxCode) throws ClassNotFoundException, SQLException, ParseException {

        ArrayList<String> expected = new ArrayList<>();
        expected.add(name);
        expected.add(surname);
        expected.add(language);
        expected.add(address1);
        expected.add(address2);
        expected.add(city);
        expected.add(state);
        expected.add(zip);
        expected.add(country);
        expected.add(gender);
        expected.add(birthdate);
        expected.add(phone);
        expected.add(fax);
        expected.add(mobile);
        expected.add(email);
        expected.add(web);
        expected.add(vatId);
        expected.add(taxCode);


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

        ArrayList<String> actual = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/ip";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();

        String sql = "SELECT * FROM ip_clients where client_name = '"+name+"'";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            actual.add(rs.getString("client_name"));
            actual.add(rs.getString("client_surname"));
            actual.add(rs.getString("client_language"));
            actual.add(rs.getString("client_address_1"));
            actual.add(rs.getString("client_address_2"));
            actual.add(rs.getString("client_city"));
            actual.add(rs.getString("client_state"));
            actual.add(rs.getString("client_zip"));


            String shortCountry = rs.getString("client_country");
            String longCountry = convertCountry(shortCountry);

            actual.add(longCountry);


            actual.add(getGender(rs.getString("client_gender")));


            actual.add(convertDate(rs.getString("client_birthdate")));
            actual.add(rs.getString("client_phone"));
            actual.add(rs.getString("client_fax"));
            actual.add(rs.getString("client_mobile"));
            actual.add(rs.getString("client_email"));
            actual.add(rs.getString("client_web"));
            actual.add(rs.getString("client_vat_id"));
            actual.add(rs.getString("client_tax_code"));
        }


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);



          Assert.assertEquals(actual,expected);
    }


    @DataProvider
    Object[][] getData() throws IOException {
      return   getMyData("Data/Client_Data.xlsx","DBTesting");
    }
}
