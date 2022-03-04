package steps;

import entities.Movie;
import entities.RentalBill;
import entities.RentalCategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import service.RentService;

import java.time.LocalDate;
import java.util.Map;

import static org.junit.Assert.*;

public class RentalSteps {

    private Movie movie;
    private RentService rentService;
    private RentalBill rentalBill;
    private String errorMessage;

    @Given("a movie has a stock of {int} unities")
    public void aMovieHasAStockOfUnities(Integer int1) {
        movie = new Movie();
        movie.addStock(int1);
    }

    @Given("the rental price is R$ {double}")
    public void theRentalPriceIs(Double double1) {
        movie.rentalPrice(double1);
    }

    @When("rent")
    public void rent() {
        if (rentService == null) {
            rentService = new RentService();
        }

        try {
            rentalBill = rentService.rent(movie, rentalBill);
        } catch (Exception e) {
            errorMessage = e.getMessage();
        }
    }

    @Then("the rental price will be R$ {double}")
    public void theRentalPriceWillBe(Double double1) {
        assertTrue(double1 == rentalBill.getBillTotalPrice());
    }

    @Then("the return date will be the next day")
    public void theReturnDateWillBeTheNextDay() {
        theReturnDateWillBeInDays(1);
    }

    @Then("will not be possible due to depletion of stock")
    public void willNotBePossibleDueToDepletionOfStock() {
        assertEquals(errorMessage, "Out of stock!");
    }

    @Then("stock will have {int} unit(ies)")
    public void stockWillHaveUnities(Integer int1) {
        assertTrue(movie.getStock() == int1);
    }

    @Given("the rental category will be {category}")
    public void theRentalCategoryWillBeExtended(RentalCategory rentalCategory) {
        if (rentalBill == null)
            rentalBill = new RentalBill();
        rentalBill.setRentalCategory(rentalCategory);
    }

    @Then("the return date will be in {int} day(s)")
    public void theReturnDateWillBeInDays(Integer int1) {
        assertEquals(LocalDate.now().plusDays(int1), rentalBill.getReturnDate());
    }

    @Then("will receive {int} point(s)")
    public void willReceivePoints(Integer int1) {
        assertTrue(int1 == rentalBill.getPoints());
    }

    @Given("a movie")
    public void aMovie(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        aMovieHasAStockOfUnities(Integer.parseInt(map.get("stock")));
        theRentalPriceIs(Double.parseDouble(map.get("price")));
        theRentalCategoryWillBeExtended(RentalCategory.getRentalCategory(map.get("category")));
    }
}
