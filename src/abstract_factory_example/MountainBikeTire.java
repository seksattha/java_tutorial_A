package abstract_factory_example;

import javax.swing.*;

public class MountainBikeTire extends Tire {

    private static final String width = "WIDE";
    private static final String pressure = "MEDIUM";


    @Override
    void getDescription() {
        System.out.println("Mountain bike tire width=> " + width + "pressure=> " + pressure);
    }
}
