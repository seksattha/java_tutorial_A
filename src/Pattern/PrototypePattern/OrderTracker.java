package Pattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class OrderTracker {
    public static void main(String[] args) {
        PizzaFlavor hawaiian = new PizzaFlavor("Hawaiian");
        Pizza hawaiianPizza1 = new Pizza(4, hawaiian);
        Pizza hawaiianPizza2= hawaiianPizza1.clone();
        Pizza hawaiianPizza3 = hawaiianPizza1.clone();




        List<Meal> order = new ArrayList<>();
        order.add(hawaiianPizza1);
        order.add(hawaiianPizza2);
        order.add(hawaiianPizza3);


        placeOrder(order);

        
    }

    private static void placeOrder (List<Meal> meals) {
        System.out.println("Order place");
        meals.forEach(System.out::println);
    }
}
