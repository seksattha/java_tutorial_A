package abstract_factory_example;

public class MountainBikeHandlebar extends Handlebar {
    private static final String type = "Straight";

    @Override
    void getDescription() {
        System.out.println("Road bike Handle bar =>" + type);
    }
}
