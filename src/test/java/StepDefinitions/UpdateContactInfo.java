package StepDefinitions;

import Pages.UpdateContactlnfoPom;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UpdateContactInfo {
    UpdateContactlnfoPom elements = new UpdateContactlnfoPom();

    @And("Click  the buttons UpdateContactInfo")
    public void clickTheButtonsUpdateContactInfo(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = elements.getWebelement(strButtonsList.get(i));
            Events.click(linkWebElement);
        }
    }

    @And("Write sendkeys user informations UpdateContactInfo")
    public void writeSendkeysUserInformationsUpdateContactInfo(DataTable keys) {
        List<List<String>> items = keys.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = elements.getWebelement(items.get(i).get(0));
            String yazi = items.get(i).get(1);

            Events.sendKeys(e, yazi);
        }
    }

    @And("Clear and user informations UpdateContactInfo")
    public void clearAndUserInformationsUpdateContactlnfo(DataTable delet) {
        List<String> strButtonsList = delet.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = elements.getWebelement(strButtonsList.get(i));
            linkWebElement.clear();
        }
    }

    @Then("Success message profile updated")
    public void successMessageProfileUpdated() {
        Events.verifyContainsText(elements.succassesMessage, "Profile Updated");
    }

    @Then("Success message update verification")
    public void successMessageUpdateVerification() {
        Events.verifyContainsText(elements.smallText, "zaha");
    }

    @Then("Warning Message required fields")
    public void warningMessageRequiredFields() {
        Events.verifyContainsText(elements.errorMessage, "is required.");
    }

    @Then("Empty message profile not updated")
    public void emptyMessageProfileNotUpdated() {
        Events.verifyContainsText(elements.succassesMessage, "");
    }
}