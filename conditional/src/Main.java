import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void ifDemo() {
        System.out.println("Pick a number between 1 to 10");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();
        System.out.println("Your picked number => " + inputtedNum);

        if (inputtedNum < 3) {
            System.out.println("Good Luck Fortune");
        } else {
            System.out.println("You screwed up");
        }

    }

    public static void loopDemo() {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song of playing repeatedly");
            String input = scanner.next();


            if ("yes".equals(input)) {
                isOnRepeat = false;
            } else {
                isOnRepeat = true;
            }
        }
        System.out.println("Playing next song");

    }
    public static void main(String[] args) {
        byte myData = 0;
        while (true) {;
            System.out.println(myData);
        }




    }
}