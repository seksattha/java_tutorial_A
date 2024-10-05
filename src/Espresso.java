public class Espresso extends Coffee{
    public static  int coffeeGround = 50;
    public static int milk = 0;
    @Override
    public void getDescription() {
        System.out.println("Espresso " + "Coffee =>" + coffeeGround +  "Milk =>" + milk);

    }
}
