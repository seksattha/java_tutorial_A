public class Person {
    private String firstName, lastName, gender;


    // This is parameterized constructor(argement constructor)
    public Person(String firstName, String lastName, String gender) {
        setFirstName(firstName);
        this.lastName = lastName;
        this.gender = gender;

    }

    //this is chain constructor
    public Person(String firstName, String lastName) {
        this(firstName, lastName, "");


    }

    // This default constructor
    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name : " + firstName + " Surname :" + lastName;
    }


}
