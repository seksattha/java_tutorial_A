public class Latte extends Coffee {
    public static  int coffeeGround = 30;
    public static int milk = 20;
    @Override
    public void getDescription() {
        System.out.println("Latte " + "Coffee =>" + coffeeGround +  "Milk =>" + milk);

    }
}
