package pages.clients;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
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
        this.driver = driver;
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

    @FindBy(id="select2-client_language-container")
    WebElement languageContainer;

    @FindBy (xpath = "//*[@role='searchbox']")
    WebElement searchBox;

    WebDriver driver;

    public void setLanguage(String language) {
        languageContainer.click();
        searchBox.sendKeys(language);
       // searchBox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();
    }

    @FindBy (id="select2-client_country-container")
    WebElement countryContainer;

    public void setCountry(String country) {
        countryContainer.click();
        searchBox.sendKeys(country);
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();
    } //

    @FindBy (id = "select2-client_gender-container")
    WebElement genderContainer;

    public void setGender(String gender) {
        genderContainer.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();
    }

    @FindBy (xpath = "//input[@id='client_birthdate']")
    WebElement birthdate;

    public void setBirthdate(String setDate)
    {
       // birthdate.sendKeys(setDate);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+setDate+"')" , birthdate);

    }

}
