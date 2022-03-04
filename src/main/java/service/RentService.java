package service;

import entities.Movie;
import entities.RentalBill;
import entities.RentalCategory;

import java.time.LocalDate;

public class RentService {
    public RentalBill rent(Movie movie, RentalBill rentalBill) {
        if (movie.getStock() > 0) {
            movie.rent();
            return billing(movie, rentalBill);
        } else {
            throw new RuntimeException("Out of stock!");
        }
    }

    private RentalBill billing(Movie movie, RentalBill rentalBill) {
        if (rentalBill == null)
            rentalBill = new RentalBill();
        rentalBill.setBillTotalPrice(movie.getRentalPrice() * rentalBill.getRentalCategory().getMultiplier());
        rentalBill.setReturnDate(LocalDate.now().plusDays(rentalBill.getRentalCategory().getDays()));
        rentalBill.addPoints(rentalBill.getRentalCategory().getGivenPoints());
        return rentalBill;
    }
}
