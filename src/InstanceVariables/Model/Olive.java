package InstanceVariables.Model;

public abstract class Olive {


    private OliveName name;
    private OliveColor color;
    private int oil;

    // constructor Method
    public Olive() {
    }

    public Olive(OliveName name, OliveColor color, int oil) {
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

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int crush() {
        String msg = name + ": " + "from" + getOrigin() + oil + " unit";
        System.out.println(msg);
        return oil;
    }

    public abstract String getOrigin();

    public void setOil(int oil) {
        this.oil = oil;
    }
}
