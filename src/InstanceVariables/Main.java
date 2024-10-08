package InstanceVariables;

import InstanceVariables.Model.Olive;
import InstanceVariables.Model.OliveColor;
import InstanceVariables.Model.OliveName;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();


        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
//        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
//        olives.add(new Olive(OliveName.KALAMATA, 0x000000, 2));
//        olives.add(new Olive(OliveName.KALAMATA, 0x000000, 2));
//        olives.add(new Olive(OliveName.KALAMATA, 0x000000, 2));
//        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
//        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total Olive oil:" + totalOil);



    }




}
