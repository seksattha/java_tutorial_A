package Pattern.StructuralDesignPattern.BridgePattern;

public class App {
    public static void main(String[] args) {
        Hoodie hoodie = new Hoodie(new ChildSize());
        hoodie.getType();
        hoodie.getSize().get();

        Shirt shirt = new Shirt(new AdultSize());
        shirt.getType();
        shirt.getSize().get();
    }

}
