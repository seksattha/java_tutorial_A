public class PersonV2 {
    private String fName;
    private String lName;

    public PersonV2(PersonV2Builder myOwnBuilder){
        this.fName = myOwnBuilder.firstName;
        this.lName = myOwnBuilder.lastName;
    }


    @Override
    public String toString() {
        return "PersonV2{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public static class PersonV2Builder {
        private String firstName;
        private String lastName;


        public PersonV2Builder setFirstName(String name) {
            this.firstName = name.toUpperCase();
            return this;
        }

        public PersonV2Builder setLastName(String surName) {
            this.lastName = surName;
            return this;
        }

        public PersonV2 createPersonV2() {
            return new PersonV2(this);
        }


    }

}
