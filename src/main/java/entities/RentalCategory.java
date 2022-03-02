package entities;

import java.util.Locale;

public enum RentalCategory {
    STANDARD(1, 1),
    EXTENDED(3, 2);

    private final int days;
    private final int givenPoints;

    private RentalCategory(int days, int givenPoints) {
        this.givenPoints = givenPoints;
        this.days = days;
    }

    public static RentalCategory getRentalCategory(String category) {
        return RentalCategory.valueOf(category.toUpperCase(Locale.ROOT));
    }

    public int getDays() {
        return days;
    }

    public int getGivenPoints() {
        return givenPoints;
    }
}
