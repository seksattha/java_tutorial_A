package Pattern.StructuralDesignPattern.FecadePattern;

import java.time.LocalDate;

public class Hotel {
    public void book(LocalDate checkInDate, LocalDate checkOutDate) {
        System.out.println("Booking hotel for " + checkInDate + "to" + checkOutDate);
    }
}
