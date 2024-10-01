package abstract_factory_example;

public class MountainBikeFactory extends BikeFactory {
    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    public Handlebar  createHandleBar() {
        return new MountainBikeHandlebar();
    }
}
