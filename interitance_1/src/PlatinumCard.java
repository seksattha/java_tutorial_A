public class PlatinumCard extends MemberCard {
    @Override
    public float discount(float amount) {
        return amount * .5f;
    }
}
