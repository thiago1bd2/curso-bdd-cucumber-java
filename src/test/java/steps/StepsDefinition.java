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

    @Given("delivery is for {int}\\/{int}\\/{int}")
    public void deliveryIsFor(int day, int month, int year) {
        date = LocalDate.of(year, month, day);
        System.out.println("Delivery date: " + date);
    }

    @When("delivery delays {int} days")
    public void deliveryDelaysDays(int numberOfDays) {
        date = date.plusDays(numberOfDays);
        System.out.println("New Delivery date: " + date);
    }

    @Then("delivery will be in {int}\\/{int}\\/{int}")
    public void deliveryWillBeIn(int day, int month, int year) {
        LocalDate newDeliveryDate = LocalDate.of(year, month, day);
        System.out.println("=========");
        System.out.println("Comparison: " + date + " | " + newDeliveryDate);
        assertEquals(date, newDeliveryDate);
    }
}
