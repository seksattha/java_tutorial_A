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


    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    }


    @Override
    public String toString() {
        return "Name : " + firstName;
    }


}
