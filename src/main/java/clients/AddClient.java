package clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    @FindBy(xpath = "//button[@id='btn-submit']")
    WebElement save;

    @FindBy(xpath = "//input[@id='client_name']")
    WebElement clientName;

    @FindBy(xpath = "//input[@id='client_surname']")
    WebElement clientSurname;

    @FindBy(xpath = "//input[@id='client_address_1']")
    WebElement streetAddress1;

    @FindBy(xpath = "//input[@id='client_address_2']")
    WebElement streetAddress2;

    @FindBy(xpath = "//input[@id='client_city']")
    WebElement city;

    @FindBy(xpath = "//input[@id='client_state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='client_zip']")
    WebElement zipCode;

    @FindBy(xpath = "//input[@id='client_phone']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='client_fax']")
    WebElement faxNumber;

    @FindBy(xpath = "//input[@id='client_mobile']")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='client_email']")
    WebElement emailAddress;

    @FindBy(xpath = "//input[@id='client_web']")
    WebElement webAddress;

    @FindBy(xpath = "//input[@id='client_vat_id']")
    WebElement vATID;

    @FindBy(xpath = "//input[@id='client_tax_code']")
    WebElement taxesCode;

    // Constructor to initialize WebDriver and WebElements
    public AddClient(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    // Individual methods for each text box
    public void setClientName(String name) {
        clientName.sendKeys(name);
    }

    public void setClientSurname(String surname) {
        clientSurname.sendKeys(surname);
    }

    public void setStreetAddress1(String address1) {
        streetAddress1.sendKeys(address1);
    }

    public void setStreetAddress2(String address2) {
        streetAddress2.sendKeys(address2);
    }

    public void setCity(String cityName) {
        city.sendKeys(cityName);
    }

    public void setState(String stateName) {
        state.sendKeys(stateName);
    }

    public void setZipCode(String zip) {
        zipCode.sendKeys(zip);
    }

    public void setPhoneNumber(String phone) {
        phoneNumber.sendKeys(phone);
    }

    public void setFaxNumber(String fax) {
        faxNumber.sendKeys(fax);
    }

    public void setMobileNumber(String mobile) {
        mobileNumber.sendKeys(mobile);
    }

    public void setEmailAddress(String email) {
        emailAddress.sendKeys(email);
    }

    public void setWebAddress(String web) {
        webAddress.sendKeys(web);
    }

    public void setVATID(String vatId) {
        vATID.sendKeys(vatId);
    }

    public void setTaxesCode(String taxCode) {
        taxesCode.sendKeys(taxCode);
    }

    // Method to save the client details
    public void saveClient() {
        save.click();
    }

}
