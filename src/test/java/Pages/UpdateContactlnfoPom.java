package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateContactlnfoPom {

    public UpdateContactlnfoPom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[id='customer.firstName']")
    public WebElement FirstName;
    @FindBy(css = "[id='customer.lastName']")
    public WebElement LastName;

    @FindBy(css = "[id='customer.address.street']")
    public WebElement Address;
    @FindBy(css = "[id='customer.address.city']")
    public WebElement City;
    @FindBy(css = "[id='customer.address.state']")
    public WebElement State;

    @FindBy(css = "[id='customer.address.zipCode']")
    public WebElement ZipCode;

    @FindBy(css = "[id='customer.phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = " //input[@class='button']")
    public WebElement updateButton;

    @FindBy(css = "p[class='smallText']")
    public WebElement smallText;


    @FindBy(xpath = "//div[@class='ng-scope']")
    public WebElement succassesMessage;
    @FindBy(xpath = "//a[text()='Update Contact Info']")
    public WebElement updateContactInfo;

    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logout;

    @FindBy(css="[class='error ng-scope']")
    public WebElement errorMessage;


    public WebElement getWebelement(String strElement) {
        switch (strElement) {

            case "clickButton": return this.updateContactInfo;
            case  "name": return this.FirstName;
            case  "surName": return this.LastName;
            case "address":return this.Address;
            case "city": return this.City;
            case "state":return this.State;
            case "zipcod":return this.ZipCode;
            case "phone": return this.phoneNumber;
            case "firstname": return this.FirstName;
            case  "lastName":return this.LastName;
            case  "Address" :  return this.Address;
            case "cty":   return this.City;
            case  "State": return  this.State;
            case  "zipcode" : return this.ZipCode;
            case  "phoneNumber": return  this.phoneNumber;
            case  "updateButton": return this.updateButton;
            case "logout": return this.logout;

        }

        return null;
    }


}
