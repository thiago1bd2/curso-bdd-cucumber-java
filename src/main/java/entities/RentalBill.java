package entities;

import java.time.LocalDate;

public class RentBill {

    private double billTotalPrice;
    private LocalDate returnDate;
    private RentalCategory rentalCategory;

    public RentBill(){
        rentalCategory = RentalCategory.STANDARD;
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
}
