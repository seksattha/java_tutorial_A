public class Main {
    public static void main(String[] args) {
//        Builder.PersonV2 p1 = new PersonV2Builder().setfName("John").setlName("Kenedy").createPersonV2();
        PersonV2 p1 = new PersonV2.PersonV2Builder().setFirstName("John").setLastName("Kenedy").createPersonV2();
        System.out.println(p1);
    }
}
