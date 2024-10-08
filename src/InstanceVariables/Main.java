package InstanceVariables;

import InstanceVariables.Model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();


        olives.add(new Olive("Kalamata", 0x2E0854, 3));
        olives.add(new Olive("Kalamata", 0x2E0854, 3));
        olives.add(new Olive("Ligurian", 0x000000, 3));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total Olive oil:" + totalOil);



    }




}
