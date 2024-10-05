package ArrayList;

import java.util.ArrayList;

public class CreateMenu {
    public static void main(String[] args) {
            demoArrayList();


    }

    public static void demoArrayList() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("Orange", "Juice", 40));
        menus.add(new Drink("Apple", "Juice", 45));
        menus.add(new Drink("lemon", "Juice", 50));
        menus.add(new Drink("Coke", "Soda", 13));
        menus.add(new Drink("Latte", "Coffee", 75));
        menus.add(new Drink("Mocha", "Coffee", 85));

        for (Drink menu : menus) {
            System.out.println(menu.getPrice());
        }
        System.out.println(menus.get(4).getPrice());
    }
}
