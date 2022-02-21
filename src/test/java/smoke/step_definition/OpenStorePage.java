package smoke.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import smoke.pages.MainPage;
import smoke.utilities.Driver;

public class OpenStorePage extends MainPage {
    @Given("user opens google page")
    public void user_opens_google_page() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("user click store")
    public void user_click_store() {
        storeBtn.click();
    }

    @Then("user can see expected title")
    public void user_can_see_expected_title() {
        Driver.getDriver().getTitle().contains("Google Store");
    }
}
