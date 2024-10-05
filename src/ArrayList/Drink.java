package ArrayList;

public class Drink {
    private String menu, category;
    private int price;

    public Drink(String menu, String category, Integer price) {
        this.menu = menu;
        this.category = category;
        this.price = price;
    }
    //Default constructor
    public Drink() {

    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        System.out.println("Price of " + this.menu + "=>");
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "menu='" + menu + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
