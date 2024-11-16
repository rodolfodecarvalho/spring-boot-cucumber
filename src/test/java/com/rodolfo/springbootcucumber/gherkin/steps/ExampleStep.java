package com.rodolfo.springbootcucumber.gherkin.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleStep {
    private String testString;
    private String resultString;

    @Given("I have a string with value {string}")
    public void i_have_a_string_with_value(String string) {
        System.out.println("GIVEN: ");
        testString = string;
    }

    @When("I reverse the string")
    public void i_reverse_the_string() {
        System.out.println("WHEN: ");
        resultString = new StringBuilder(testString).reverse().toString();
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expectedResult) {
        System.out.println("THEN: ");
        assertEquals(expectedResult, resultString);
    }
}