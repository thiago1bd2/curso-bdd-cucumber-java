package steps;

import io.cucumber.java.ParameterType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParameterTypes {

    @ParameterType("(\\d{2}/\\d{2}/\\d{4})")
    public LocalDate localdate(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
