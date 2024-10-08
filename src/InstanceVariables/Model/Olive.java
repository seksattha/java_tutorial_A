package InstanceVariables.Model;

public class Olive {


    private OliveName name = OliveName.KALAMATA;
    private long color = 0x2E0854;
    private int oil = 3;

    // constructor Method
    public Olive() {
    }

    public Olive(OliveName name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;

    }


    //getter and setter
    //------------------Getter & Setter--------------------------------

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        System.out.println("Ouch!!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
