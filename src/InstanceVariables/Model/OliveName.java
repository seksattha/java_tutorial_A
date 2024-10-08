package InstanceVariables.Model;

public enum OliveName {
    KALAMATA("Katamala"), LIGURIAN("Ligurian");

    //create variable
    private String name;

    // create a construction method for this enumeration

    // do not put the "Public" key word on this ?
    //------can be called only in Enum------------
    OliveName(String name) {
        this.name = name;
    }

    // use toString method to show the information.

    @Override
    public String toString() {
        return ("Name of Olive =>  " + name);
    }
}
