public class CoffeeCreator {
    public static CoffeeFactory createFactory(String type) {
        if (type.equalsIgnoreCase("Espresso")) {
            System.out.println("Espresso has been selected");
            return new EspressoFactory();
        } else if (type.equalsIgnoreCase("Latte")) {
            System.out.println("Latte has been selected");
            return new LatteFactory();
        } else {
            System.out.println("invalid choice");
            return null;
        }
    }
}
