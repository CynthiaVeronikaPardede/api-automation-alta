package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;

public class UsersSteps {
    @Steps
    Get get;
    @Given("I set Get api endpoints")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }
    @When("I send Get HTTP request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }
    @Then("I received valid HTTP response code 200")
    public void receiveValidHttpResponse() {
        get.receiveValidHttpResponseCode200();
    }
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser() {
        get.validDataDetailUser();
    }
}
