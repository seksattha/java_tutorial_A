import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        demo_iteration();



    }

    public static void demo1() {
        ArrayList<String> myStringList = new ArrayList<>();
        //adding elements
        myStringList.add("Stark");
        myStringList.add("Lannister");
        myStringList.add("Baratheon");
        myStringList.add("Targaryen");

        System.out.println(myStringList);
        //<b>Accessing elements<b>
        System.out.println(myStringList.get(0));
        System.out.println(myStringList.get(1));
        
        //modifying elements
        myStringList.set(0,"Bolton");
        // Change index = 0 from Stark to Bolton
        System.out.println(myStringList);

        //Removing element from List
        myStringList.remove(3);
        //removing Targaryen from our list
        System.out.println(myStringList);

    }

    public static void demo_iteration() {
        ArrayList<String> myStringList = new ArrayList<>();
        //adding elements
        myStringList.add("Stark");
        myStringList.add("Lannister");
        myStringList.add("Baratheon");
        myStringList.add("Targaryen");

        for (int i = 0; i < myStringList.size(); i++) {

            System.out.println(myStringList.get(i));
        }

    }
}