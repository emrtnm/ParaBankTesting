package Pages;

import Utilities.Events;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistirationPOM extends Events {

    public RegistirationPOM() {
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

    @FindBy(xpath = "(//input[@class='input'])[1]")
    public WebElement loginUserName;

    @FindBy(xpath = "(//input[@class='input'])[2]")
    public WebElement loginPassword;


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

    @FindBy(css = "//*[@id=\"leftPanel\"]/p/b")
    public WebElement WelcomeMsg;

    @FindBy(css = "input[type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[4]/a")
    public WebElement bill_pay;

    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(name = "payee.address.street")
    public WebElement adress;

    @FindBy(name = "payee.address.city")
    public WebElement city1;

    @FindBy(name = "payee.address.state")
    public WebElement payeState;

    @FindBy(name = "payee.address.zipCode")
    public WebElement zipCode;

    @FindBy(name = "payee.phoneNumber")
    public WebElement phone;
    @FindBy(name = "payee.accountNumber")
    public WebElement account;

    @FindBy(name = "verifyAccount")
    public WebElement verfiyAccount;

    @FindBy(name = "amount")
    public WebElement amount;

    @FindBy(css = "input[value='Send Payment']")
    public WebElement send_payment;


    // input[value='Send Payment']


    public WebElement getWebElements(String elementText) {

        // success_Msg
        switch (elementText) {
            case "firstName":
                return this.firstName;
            case "Register":
                return this.Register;
            case "bill_pay":
                return this.bill_pay;
            case "amount":
                return this.amount;
            case "payeeName":
                return this.payeeName;
            case "adress":
                return this.adress;
            case "city1":
                return this.city1;
            case "payeState":
                return this.payeState;
            case "zipCode":
                return this.zipCode;
            case "success_Msg":
                return this.success_Msg;
            case "phone":
                return this.phone;
            case "account":
                return this.account;
            case "verfiyAccount":
                return this.verfiyAccount;
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
