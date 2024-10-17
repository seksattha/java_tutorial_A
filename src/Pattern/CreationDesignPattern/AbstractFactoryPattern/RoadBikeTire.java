package Pattern.CreationDesignPattern.AbstractFactoryPattern;

public class RoadBikeTire extends Tire {

    private static final String width = "Narrow";

    @Override
    void getDescription() {
        System.out.println("Road boke tire width => " + width);

    }
}
