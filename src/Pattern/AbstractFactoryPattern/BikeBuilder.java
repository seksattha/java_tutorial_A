package Pattern.AbstractFactoryPattern;

public class BikeBuilder {
    public static void main(String[] args) {

        createBikeWithAbstractFactory("road bike");

    }

    public static void createBikeWithoutAbstractFactory() {
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();
        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println();

    }

    public static void createBikeWithAbstractFactory(String type) {
        BikeFactory myFactory = FactoryCreator.createFactory(type);
        Tire tireFront = myFactory.createTire();
        Tire tireBack = myFactory.createTire();
        Handlebar handlebar = myFactory.createHandleBar();


        tireFront.getDescription();
        tireFront.getDescription();
        handlebar.getDescription();
        System.out.println();


    }
}
