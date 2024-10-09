package Pattern.PrototypePattern;

public abstract class Meal {
    //create variable  price
    private int price;

    public Meal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price= price;
    }

    public abstract Meal clone();

}
