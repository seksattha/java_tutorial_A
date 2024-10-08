package InstanceVariables;

import java.util.List;
import InstanceVariables.Model.Olive;

public class OlivePress {
    //create the instance method
    public int getOil(List<Olive> olives) {
        for (Olive o : olives) {
            System.out.println(o.name);
        }
        return 0;
    }
}
