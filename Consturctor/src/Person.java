public class Person {
    private String firstName, lastName, gender;


    // This is parameterized constructor(argement constructor)
    public Person(String firstName, String lastName, String gender) {
        setFirstName(firstName);
        this.lastName = lastName;
        this.gender = gender;

    }

    //this is default constructor
    public Person(String firstName, String lastName) {
        this(firstName, lastName, "");


    }

    // This is chain constructor
    public


    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    }


    @Override
    public String toString() {
        return "Name : " + firstName;
    }


}
