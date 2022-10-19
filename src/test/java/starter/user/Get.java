package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Get {
    public static String url= "https://demoqa.com/books";

    @Step("I set Get api endpoints")
    public String setApiEndpoint() {
        return url + "users/2";
    }

    @Step("I send Get HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I received valid HTTP response code 200")
    public void receiveValidHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void validDataDetailUser() {
        restAssuredThat(response -> response.body("'data', 'id'", equalTo(2)));
        restAssuredThat(response -> response.body("'data','first_name'", equalTo("Janet")));
    }
}
