public class GoldCard extends MemberCard {
    @Override
    public float discount(float amount) {
        if (amount > 2000) {
            System.out.println(String.format("You have paid according to our condition with %.2f", amount));
            return amount * .10f;
        } else {
            return amount * .5f;
        }
    }
}
