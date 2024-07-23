public class Patient extends Person {
    private float weight, height;

    public Patient(String firstName, String lastName, String gender,
                   float weight, float height) {
        super(firstName, lastName, gender);
        this.weight = weight;
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
