package entities;

import java.time.LocalDate;

public class RentalBill {

    private double billTotalPrice;
    private LocalDate returnDate;
    private RentalCategory rentalCategory;
    private int points;

    public RentalBill(){
        rentalCategory = RentalCategory.STANDARD;
        points = 0;
    }

    public double getBillTotalPrice() {
        return billTotalPrice;
    }

    public void setBillTotalPrice(double billTotalPrice) {
        this.billTotalPrice = billTotalPrice;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setRentalCategory(RentalCategory rentalCategory) {
        this.rentalCategory = rentalCategory;
    }

    public RentalCategory getRentalCategory() {
        return rentalCategory;
    }

    public void addPoints(int calculatePoints) {
        this.points += calculatePoints;
    }

    public int getPoints(){
        return points;
    }
}
