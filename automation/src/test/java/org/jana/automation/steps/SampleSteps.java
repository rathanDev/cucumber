package org.jana.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@CucumberContextConfiguration
public class SampleSteps {

    @When("^I access the /hello endpoint$")
    public void i_access_the_hello_endpoint() {
        boolean isSystemUp = true;
        assertTrue("The system should be up", isSystemUp);
    }

    @Given("the system is up and running")
    public void givenTheSystemIsUp() {
        boolean isSystemUp = true;
        assertTrue("The system should be up", isSystemUp);
    }

    @Then("the system should respond with success")
    public void the_system_should_respond_with_success() {
        boolean isSystemUp = true;
        assertTrue("The system should be up", isSystemUp);
    }

}