package InstanceVariables.Model;

public class Olive {
    String name = "Kalamata";
    long color = 0x2E0854;
    int oil = 3;

    // constructor Method
    public Olive() {
    }

    public Olive(String name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;

    }


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
