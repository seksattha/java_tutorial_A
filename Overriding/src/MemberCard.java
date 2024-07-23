public abstract class MemberCard {
    private String fname, lname;

    public MemberCard(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public MemberCard() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public float discount(float amount) {
        if (amount > 1000f) {
            return amount * .2f;
        } else {
            return 0f;
        }
    }

    public abstract float rewardXpoint();
    //inherited subclassses are unable to override this method.
    public final int calcPoint(float amount) {
        return (int) ((amount / 20) * rewardXpoint());
    }





}
