package Pattern.StructuralDesignPattern.FecadePattern;

import java.time.LocalDate;

public class VocationFecade {

    public void book(LocalDate startDate, LocalDate endDate) {
        Flight flight = new Flight();
        flight.bookOutwardJourney(startDate);
        flight.bookReturnJourney(endDate);

        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);

        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);
    }
}
