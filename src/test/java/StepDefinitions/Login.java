package StepDefinitions;

import Pages.LoginPom;
import Utilities.Events;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
    LoginPom elements = new LoginPom();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        GWD.getDriver().navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @And("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        Events.sendKeys(elements.username, "acabbar");
        Events.sendKeys(elements.password, "alicabbar1234");
        Events.jsClick(elements.loginBtn);
    }

    @Then("I should login with successfully")
    public void iShouldLoginWithSuccessfully() {
        Events.verifyContainsText(elements.resultMsg, "Welcome");
    }

    @And("Enter {string} as username and {string} as password and click login button")
    public void enterAsUsernameAndAsPasswordAndClickLoginButton(String username, String password) {
        Events.sendKeys(elements.username, username);
        Events.sendKeys(elements.password, password);
        Events.jsClick(elements.loginBtn);
    }

    @Then("User should see the error message")
    public void userShouldSeeTheErrorMessage() {
        Events.verifyContainsText(elements.errorMsg, "Error");
    }
}
