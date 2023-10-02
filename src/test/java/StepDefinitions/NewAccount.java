package StepDefinitions;

import Pages.AccountServices;
import Pages.LoginPom;
import Pages.NewAccountPom;
import Utilities.Events;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class NewAccount {

    AccountServices as = new AccountServices();
    NewAccountPom nap = new NewAccountPom();

    @Given("Click open new account button from account services menu")
    public void clickOpenNewAccountButtonFromAccountServicesMenu() {
        Events.jsClick(as.openNewAccount);
    }

    @And("Verify the page, account types existing in the options")
    public void verifyThePageAccountTypesExistingInTheOptions() {
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("https://para.testar.org/parabank/openaccount.htm"));
        Assert.assertTrue(nap.accountTypes.get(0).getText().contains("CHECKING"));
        Assert.assertTrue(nap.accountTypes.get(1).getText().contains("SAVINGS"));
    }

    @And("Select one of the account types in the options")
    public void selectOneOfTheAccountTypesInTheOptions() {
        int randomSecim = (int) (Math.random() * nap.accountTypes.size());
        new Select(nap.accountTypeDropbox).selectByIndex(randomSecim);
    }

    @And("Verify the message of minimum deposit amount for the account at time of opening")
    public void verifyTheMessageOfMinimumDepositAmountForTheAccountAtTimeOfOpening() {
        Assert.assertTrue(nap.minimumDepositMessage.getText().contains("A minimum of $100,00 must be deposited"));
    }

    @And("Select one of the account from the options")
    public void selectOneOfTheAccountFromTheOptions() {
        int randomSecim = (int) (Math.random() * nap.accountIDs.size());
        new Select(nap.accountIDdropbox).selectByIndex(randomSecim);
    }

    @Then("Click open new account button")
    public void clickOpenNewAccountButton() {
        Events.jsClick(nap.openNewAccount);
    }

    @And("Verify confirmation message and new account number")
    public void verifyConfirmationMessageAndNewAccountNumber() {
        Events.verifyContainsText(nap.newAccountOpenedMessage, "Account Opened!");
        Assert.assertTrue(nap.newAccountID.isDisplayed());
    }
}
