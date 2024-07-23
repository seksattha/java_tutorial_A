public class GoldCard extends MemberCard {
    @Override
    public float discount(float amount) {
        if (amount > 2000) {
            return amount * .03f;
        } else {
            return .0f;
        }
    }

    @Override
    public float rewardXpoint() {
        return 2f;
    }
}
