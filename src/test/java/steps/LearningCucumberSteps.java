package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.*;

public class StepsDefinition {

    private int count = 0;

    @Given("a file is correctly created")
    public void fileCorrectlyCreated() {
    }

    @Given("count value is {int}")
    public void countValueIs(int value) {
        count = value;
    }

    @When("it is ran")
    public void runFile() {
    }

    @When("we increment count value in {int}")
    public void weIncrementCountValueIn(int number) {
        count += number;
    }

    @Then("the spec must finish with success")
    public void executedWithSuccess() {
    }

    @Then("count value will be {int}")
    public void countValueWillBe(int newValue) {
        assertEquals(count, newValue);
    }

    private LocalDate date;

    @Given("delivery is for {localdate}")
    public void deliveryIsFor(LocalDate deliveryDate) {
        date = deliveryDate;
        System.out.println("Delivery date: " + date);
    }

    @When("delivery delays {int} {string}")
    public void deliveryDelaysIn(int amount, String dateUnit) {
        switch (dateUnit) {
            case "days":
                date = date.plusDays(amount);
                break;
            case "months":
                date = date.plusMonths(amount);
                break;
        }
        System.out.println("New Delivery date: " + date);
    }

    @Then("delivery will be in {localdate}")
    public void deliveryWillBeIn(LocalDate newDeliveryDate) {
        assertEquals(date, newDeliveryDate);
    }

    @Given("(especial )ticket number is A{}")
    public void ticketNumberIs(String string) {
    }

    @Given("the ticket value is R$ {double}")
    public void theTicketValueIs(Double value) {
    }

    @Given("passenger name is {string}")
    public void passengerNameIs(String string) {
    }

    @Given("^passenger phone number is (9\\d{3}-\\d{4})$")
    public void passengerPhoneNumberIs(String phoneNumber) {
    }

    @When("create steps")
    public void createSteps() {
    }

    @Then("test gonna work")
    public void testGonnaWork() {
    }
}
