package Pattern.BuilderPattern;

import java.time.LocalDate;

public class SaleLeadTracker {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("John", "Doe")
                .dateOfBirth(LocalDate.of(1995,12,12))
                .emailAddress("john@example.com")
                .phoneNumber("123456789").build();

        addPersonToLeadTracker(person1);
    }


    public static void addPersonToLeadTracker(Person aPerson) {
        System.out.println("A new lead was added to lead Tracker =>" + aPerson);
    }
}
