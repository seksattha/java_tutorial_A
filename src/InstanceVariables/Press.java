package InstanceVariables;

import InstanceVariables.Model.Olive;

import java.util.List;

public interface Press {
    //Interface is a contract

    //just only method signature.

    // must have this method
    public int getOil(List<Olive> olives);

    public void setOil(int oil);
}
