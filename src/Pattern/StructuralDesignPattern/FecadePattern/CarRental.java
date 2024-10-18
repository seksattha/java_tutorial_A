package Pattern.StructuralDesignPattern.FecadePattern;

import java.time.LocalDate;

public class CarRental {

    public void book(LocalDate checkInDate, LocalDate checkOutDate) {
        System.out.println("Booking car for " + checkInDate + "to" + checkOutDate);
    }
}
