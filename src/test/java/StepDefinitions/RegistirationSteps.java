package StepDefinitions;

import Pages.RegisterPOM;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class RegistirationSteps {
    RegisterPOM rp = new RegisterPOM();
    @Given("The user must navigates to the ParaBank website")
    public void theUserMustNavigatesToTheParaBankWebsite() {

        GWD.getDriver().get("https://para.testar.org/parabank/index.htm");

    }



    @When("The click the connection such as register button on the home page.")
    public void theClickTheConnectionSuchAsRegisterButtonOnTheHomePage() {

        rp.ButtonClick(rp.Register);

        }





    @Then("The user must fill out the registration form and use information that is not valid in this form.")
    public void theUserMustFillOutTheRegistrationFormAndUseInformationThatIsNotValidInThisForm(DataTable dataTable) {

        List<List<String>> list = dataTable.asLists(String.class);
        for (int i = 0; i <list.size() ; i++) {

            rp.sendText(rp.getWebElements(list.get(i).get(0)),list.get(i).get(1));

        }



    }

    @And("After completing the registration form, the user must click on a button such as submit or register.")
    public void afterCompletingTheRegistrationFormTheUserMustClickOnAButtonSuchAsSubmitOrRegister(DataTable dt) {


        List<String> l  = dt.asList(String.class);
        rp.ButtonClick(rp.getWebElements(l.get(0)));
    }

    @And("The user must verify a successful registration process and {string} should see a message like.")
    public void theUserMustVerifyASuccessfulRegistrationProcessAndShouldSeeAMessageLike(String txtMsg) {


        Assert.assertTrue(rp.WelcomeTXT.getText().contains("Welcome"));
        boolean exist = false;

        try {

            if (txtMsg.toLowerCase().contains(rp.success_Msg.getText().toLowerCase())) {
                exist =true;

                Assert.assertTrue(exist);


            } else
                Assert.assertFalse(exist);


        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
