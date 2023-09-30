package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM extends Parent{
    public RegisterPOM() {

        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"customer.firstName\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"customer.lastName\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"customer.address.street\"]")
    public WebElement address;

    @FindBy(xpath = "//*[@id=\"customer.address.city\"]")
    public WebElement city;

    @FindBy(xpath = "//*[@id=\"customer.address.state\"]")
    public WebElement state;

    @FindBy(xpath = "//*[@id=\"customer.address.zipCode\"]")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@id=\"customer.phoneNumber\"]")
    public WebElement phone_Number;

    @FindBy(xpath = "//*[@id=\"customer.ssn\"]")
    public WebElement ssn_code;

    @FindBy(xpath = "//*[@id=\"customer.username\"]")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='repeatedPassword']")
    public WebElement confirm;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
    public WebElement Register;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement RegisterButton;

    @FindBy(xpath = "//div//h1")
    public WebElement WelcomeTXT;

    @FindBy(xpath = "(//div//p)[3]")
    public WebElement success_Msg;

    //

    public WebElement getWebElements(String elementText) {

        // success_Msg
        switch (elementText) {
            case "firstName":
                return this.firstName;
            case "Register":
                return this.Register;
            case "success_Msg":
                return this.success_Msg;
            case "WelcomeTXT":
                return this.WelcomeTXT;
            case "RegisterButton":
                return this.RegisterButton;
            case "lastName":
                return this.lastName;
            case "address":
                return this.address;
            case "city":
                return this.city;
            case "state":
                return this.state;
            case "zipcode":
                return this.zipcode;
            case "phone_Number":
                return this.phone_Number;
            case "ssn_code":
                return this.ssn_code;
            case "userName":
                return this.userName;
            case "password":
                return this.password;
            case "confirm":
                return this.confirm;
        }

        return null;
    }

}
