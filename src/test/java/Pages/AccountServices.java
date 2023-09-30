package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountServices extends Parent{
    public AccountServices() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;

    @FindBy(xpath = "//a[text()='Accounts Overview']")
    public WebElement accountsOverview;

    @FindBy(xpath = "//a[text()='Transfer Funds']")
    public WebElement transferFunds;

    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billPay;

    @FindBy(xpath = "//a[text()='Find Transactions']")
    public WebElement findTransactions;

    @FindBy(xpath = "//a[text()='Update Contact Info']")
    public WebElement updateContactInfo;

    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logout;
}
