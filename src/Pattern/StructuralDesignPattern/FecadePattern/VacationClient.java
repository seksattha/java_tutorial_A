package Pattern.StructuralDesignPattern.FecadePattern;

import java.time.LocalDate;

public class VacationClient {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2021, 8, 1);
        LocalDate endDate = LocalDate.of(2021, 8, 15);

        VocationFecade fecade = new VocationFecade();
        fecade.book(startDate, endDate);

    }
}
