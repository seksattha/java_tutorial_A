public class MemberCard extends Person {
    private String memberID;

    public MemberCard(String firstName, String lastName, String gender,
                      String memberID) {
        super(firstName, lastName, gender);
        this.memberID = memberID;
    }

    public MemberCard() {
        System.out.println("MemberCard Class constructor has been called");
    }

    public float discount(float amount) {
        return amount * .03f;
    }








}
