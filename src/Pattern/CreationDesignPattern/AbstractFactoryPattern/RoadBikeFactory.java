package Pattern.CreationDesignPattern.AbstractFactoryPattern;

public class RoadBikeFactory extends BikeFactory {
    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    public Handlebar createHandleBar() {
        return new RoadBikeHandlebar();
    }
}
