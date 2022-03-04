package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeuBarrigaSteps {
    private WebDriver driver;

    @Given("the user is accessing the application")
    public void theUserIsAccessingTheApplication() {
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/");
    }

    @Given("inserts the username {string}")
    public void insertsTheUsername(String string) {
        driver.findElement(By.id("email")).sendKeys(string);
    }

    @Given("inserts the password {string}")
    public void insertsThePassword(String string) {
        driver.findElement(By.id("senha")).sendKeys(string);
    }

    @Given("logs-in")
    public void logsIn() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Given("main page is loaded")
    public void mainPageIsLoaded() {
        String expectedMessage = "Bem vindo, SeleniumTeste!";
        String actualMessage = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("select option {string}")
    public void select(String string) {
        driver.findElement(By.linkText(string)).click();
    }

    @When("insert the account name {string}")
    public void insertTheAccountName(String string) {
        driver.findElement(By.id("nome")).sendKeys(string);
    }

    @When("save the account")
    public void saveTheAccount() {
        driver.findElement(By.xpath("//button")).click();
    }

    @Then("the account is saved successfully")
    public void theAccountIsSavedSuccessfully() {
        String expectedMessage = "Conta adicionada com sucesso!";
        String actualMessage = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("the account is not saved with message error {string}")
    public void theAccountIsNotSavedWithMessageError(String string) {
        String expectedMessage = string;
        String actualMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
