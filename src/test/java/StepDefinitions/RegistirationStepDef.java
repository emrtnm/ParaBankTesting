package StepDefinitions;

import Pages.RegistirationPOM;
import Utilities.Events;
import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class RegistirationStepDef {
    RegistirationPOM rp = new RegistirationPOM();

    @Given("The user must navigates to the ParaBank website")
    public void theUserMustNavigatesToTheParaBankWebsite() {

        GWD.getDriver().get("https://para.testar.org/parabank/index.htm");

    }


    @When("The click the connection such as register button on the home page.")
    public void theClickTheConnectionSuchAsRegisterButtonOnTheHomePage() {

        Events.click(rp.Register);

    }


    @Then("The user must fill out the registration form and use information that is not valid in this form.")
    public void theUserMustFillOutTheRegistrationFormAndUseInformationThatIsNotValidInThisForm(DataTable dataTable) {

        List<List<String>> list = dataTable.asLists(String.class);
        for (int i = 0; i < list.size(); i++) {

            WebElement e = rp.getWebElements(list.get(i).get(0));
            Events.sendKeys(e, list.get(i).get(1));

        }


    }

    @And("After completing the registration form, the user must click on a button such as submit or register.")
    public void afterCompletingTheRegistrationFormTheUserMustClickOnAButtonSuchAsSubmitOrRegister(DataTable dt) {


    }

    @And("The user must verify a successful registration process and {string} should see a message like.")
    public void theUserMustVerifyASuccessfulRegistrationProcessAndShouldSeeAMessageLike(String txtMsg) {


        Assert.assertTrue(rp.WelcomeTXT.getText().contains("Welcome"));
        boolean exist = false;

        try {

            if (txtMsg.toLowerCase().contains(rp.success_Msg.getText().toLowerCase())) {
                exist = true;

                Assert.assertTrue(exist);


            } else
                Assert.assertFalse(exist);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Then("The user must fill out the registration form by using XML file and click the register button")
    public void theUserMustFillOutTheRegistrationFormByUsingXMLFileAndClickTheRegisterButton() {
        ArrayList<ArrayList<String>> list = ExcelUtility.getData("src/test/java/Utilities/Registiration.xlsx", "Sayfa1", 11);
        for (ArrayList<String> l : list) {

            Events.click(rp.Register);

            Events.sendKeys(rp.firstName, l.get(0));
            Events.sendKeys(rp.lastName, l.get(1));
            Events.sendKeys(rp.address, l.get(2));
            Events.sendKeys(rp.city, l.get(3));
            Events.sendKeys(rp.state, l.get(4));
            Events.sendKeys(rp.zipcode, l.get(5));
            Events.sendKeys(rp.phone_Number, l.get(6));
            Events.sendKeys(rp.ssn_code, l.get(7));
            Events.sendKeys(rp.userName, l.get(8));
            Events.sendKeys(rp.password, l.get(9));
            Events.sendKeys(rp.confirm, l.get(10));

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Events.click(rp.RegisterButton);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            GWD.getDriver().navigate().to("https://para.testar.org/parabank/index.htm");


        }

    }

}
