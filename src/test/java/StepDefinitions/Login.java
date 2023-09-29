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
        GWD.getDriver().navigate().to("https://para.testar.org/parabank/index.htm");
    }

    @And("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        Events.sendKeys(elements.username, "acabbar");
        Events.sendKeys(elements.password, "alicabbar1234");
        Events.jsClick(elements.loginBtn);
    }

    @Then("I should login with successfully")
    public void iShouldLoginWithSuccessfully() {
        Events.verifyContainsText(elements.resultMsg, "adasd");
    }
}
