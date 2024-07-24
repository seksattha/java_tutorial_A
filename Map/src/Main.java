import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Lannister", "Casterly Rock");
        myMap.put("Stark", "Winter Fell");
        myMap.put("Targaryen", "Dragon Stone");
        //Accessing Value by key



        System.out.println(myMap.get("Stark"));
        System.out.println("*-".repeat(40));
        //ตรงนี้มันจะคล้ายๆ กับ python ที่เหมือน .key ,value , items
        //key จะใช้ method keySet()
        for (String key : myMap.keySet()) {
            System.out.println(key);

        }
        //key จะใช้ method values()
        for (String value : myMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : myMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(String.format("key = %-10s value = %s", key, value));
        }







    }
}