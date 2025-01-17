import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Input date
        LocalDate date = LocalDate.of(2023, 1, 17);

        // Adding 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Date after addition: " + updatedDate);
        System.out.println("Date after subtraction: " + finalDate);
    }
}
