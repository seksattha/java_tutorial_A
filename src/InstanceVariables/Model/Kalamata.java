package InstanceVariables.Model;

public class Kalamata extends Olive {
    public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE,2);
    }

    @Override
    public String getOrigin() {
        return "Greece";
    }
}
