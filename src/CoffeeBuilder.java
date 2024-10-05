public class CoffeeBuilder {
    public static void main(String[] args) {
        CoffeeFactory myFactory = CoffeeCreator.createFactory("Latte");
        Coffee myLatte = myFactory.createCoffee();
        Coffee myLatte2 = myFactory.createCoffee();



        myLatte.getDescription();
        myLatte2.getDescription();

    }
}
