package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewAccountPom {

    public NewAccountPom(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath="//*[@id='type']/option")
    public List<WebElement> accountTypes;

    @FindBy(xpath="//*[@id='type']")
    public WebElement accountTypeDropbox;

    @FindBy(xpath="(//*[@ng-submit='submit()']//p)[2]")
    public WebElement minimumDepositMessage;

    @FindBy(xpath="//*[@id='fromAccountId']/option")
    public List<WebElement> accountIDs;

    @FindBy(xpath="//*[@id='fromAccountId']")
    public WebElement accountIDdropbox;

    @FindBy(xpath="//*[@type='submit']")
    public WebElement openNewAccount;

    @FindBy(xpath="//*[@id='rightPanel']//h1")
    public WebElement newAccountOpenedMessage;

    @FindBy(xpath="//*[@id='newAccountId']")
    public WebElement newAccountID;

}