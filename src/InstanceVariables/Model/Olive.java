package InstanceVariables.Model;

public class Olive {
    private String name = "Kalamata";
    private long color = 0x2E0854;
    private int oil = 3;

    //getter and setter
    //------------------Getter & Setter--------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
