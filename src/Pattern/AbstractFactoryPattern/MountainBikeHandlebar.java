package Pattern.AbstractFactoryPattern;

public class MountainBikeHandlebar extends Handlebar {
    private static final String type = "Straight";

    @Override
    void getDescription() {
        System.out.println("Road bike Handle bar =>" + type);
    }
}
