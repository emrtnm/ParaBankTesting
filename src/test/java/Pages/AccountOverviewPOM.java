package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountOverviewPOM {
    public AccountOverviewPOM(){

        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath="//a[text()='Accounts Overview']")
    public WebElement accounText;
    @FindBy(xpath="//*[@id='gtx-trans']")
    public WebElement amountSum;

    @FindBy(xpath="//a[@class='ng-binding']")
    public WebElement accountNumber;
    @FindBy(xpath="(//h1[@class='title']) [2]")
    public WebElement accountActivity;
    @FindBy(xpath="//*[@id='transactionType']/option")
    public List<WebElement> transactionType;
    @FindBy(xpath="//*[@id='transactionTable']")
    public WebElement textTransaction;
    @FindBy(xpath=" //a[@class='ng-binding']")
    public WebElement billPayment;

    @FindBy(xpath="//*[@id='rightPanel']/h1")
    public WebElement detailsTransaction;


}

