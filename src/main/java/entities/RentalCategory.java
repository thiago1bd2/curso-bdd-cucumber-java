package entities;

import java.util.Locale;

public enum RentalCategory {
    STANDARD(1, 1, 1),
    EXTENDED(3, 2, 2),
    WEEKLY(7,3, 3);

    private final int days;
    private final int givenPoints;
    private final int multiplier;

    private RentalCategory(int days, int givenPoints, int multiplier) {
        this.givenPoints = givenPoints;
        this.days = days;
        this.multiplier = multiplier;
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

    public int getMultiplier() {
        return multiplier;
    }
}
