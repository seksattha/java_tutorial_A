package abstract_factory_example;

public class RoadBikeHandlebar extends Handlebar {
    private static final String type = "DROP";
    @Override
    void getDescription() {
        System.out.println("Road bike Handle bar =>" + type);

    }
}
