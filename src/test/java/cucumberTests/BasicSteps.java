package cucumberTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicSteps {
    public String contents;
    public String sent;

    @Given("a message which says {string}")
    public void aMessageWhichSays(String contents) {
        this.contents = contents;
    }

    @When("I send the message")
    public void iSendTheMessage() {
        sent = contents;
    }


    @Then("I expect to see the message {string}")
    public void iExpectToSeeTheMessage(String expected) {
        assertEquals(expected, sent);
    }
}
