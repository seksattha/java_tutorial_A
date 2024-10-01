package abstract_factory_example;

public class RoadBikeTire extends Tire {

    private static final String width = "Narrow";

    @Override
    void getDescription() {
        System.out.println("Road boke tire width => " + width);

    }
}
