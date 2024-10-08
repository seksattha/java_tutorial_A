package InstanceVariables;

import java.util.List;
import InstanceVariables.Model.Olive;

public class OlivePress implements Press {
    //create the instance method
    private int currentOil;

    public int getOil(List<Olive> olives) {

        int totalOil = currentOil;
        for (Olive o : olives) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;
    }

    @Override
    public void setOil(int oil) {
        currentOil = oil;
    }
}
