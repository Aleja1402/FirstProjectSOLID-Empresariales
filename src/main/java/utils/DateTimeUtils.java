package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

    public static String formatDate(LocalDate date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format); //Example: "dd/MM/yyyy"
        return date.format(formatter);
    }
    
    public static LocalDate createDate(int year, int month, int day) {
        LocalDate specificDate = LocalDate.of(year, month, day);
        return specificDate;
    }
    
}