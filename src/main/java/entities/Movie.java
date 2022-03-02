package entities;

public class Movie {

    private int stock;
    private double rentalPrice;

    public void addStock(Integer int1) {
        if (int1 < 0) {
            throw new RuntimeException("Stock cannot be negative.");
        } else {
            stock = int1;
        }
    }

    public void rentalPrice(Double double1) {
        if (double1 < 0) {
            throw new RuntimeException("Rental price cannot be negative.");
        } else {
            rentalPrice = double1;
        }
    }

    public void rent() {
        if (stock > 0)
            stock--;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public int getStock() {
        return this.stock;
    }
}
