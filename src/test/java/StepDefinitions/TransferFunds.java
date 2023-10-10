package StepDefinitions;

import Pages.AccountServices;
import Pages.TransferFundsPom;
import Utilities.Events;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransferFunds {
    AccountServices as = new AccountServices();
    TransferFundsPom tfp = new TransferFundsPom();

    @Given("The user must come to the transfer Funds transaction page")
    public void theUserMustComeToTheTransferFundsTransactionPage() {
        Events.click(as.transferFunds);
    }

    @When("The user must complete the Transfer Fund transaction")
    public void theUserMustCompleteTheTransferFundTransaction()  {
       Events.sendKeys(tfp.amount, "15");
       Events.select(tfp.fromAccount).selectByIndex(0);
       Events.select(tfp.toAccount).selectByIndex(1);
       Events.click(tfp.transferButton);
    }

    @Then("User must verify Transfer Fund transaction")
    public void userMustVerifyTransferFundTransaction() {
        Events.verifyContainsText(tfp.amountControl,"15");
        Events.verifyContainsText(tfp.fromAccountControl,"14565");
        Events.verifyContainsText(tfp.toAccountControl,"17007");
    }

    @And("The user must check that the account sent from the account appears as credit")
    public void theUserMustCheckThatTheAccountSentFromTheAccountAppearsAsCredit() {
        Events.click(as.accountsOverview);
        Events.click(tfp.sentAccount);
        Events.verifyContainsText(tfp.amountSent,"$15");
    }
}
