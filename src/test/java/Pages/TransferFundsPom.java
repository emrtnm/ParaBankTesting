package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsPom {
    public TransferFundsPom(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy (id = "amount")
    public WebElement amount;
    @FindBy (id = "fromAccountId")
    public WebElement fromAccount;
    @FindBy (id = "toAccountId")
    public WebElement toAccount;
    @FindBy(xpath = "//input[@value='Transfer']")
    public WebElement transferButton;
    @FindBy(id = "amount")
    public WebElement amountControl;
    @FindBy (id = "fromAccountId")
    public WebElement fromAccountControl;
    @FindBy (id = "toAccountId")
    public WebElement toAccountControl;
    @FindBy (xpath = "(//table[@id='accountTable']//tr)[3]//a")
    public WebElement sentAccount;
    @FindBy(xpath = "//table[@id=\"transactionTable\"]/tbody/tr[5]/td[4]")
    public WebElement amountSent;
}
