//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void demo_class_object1() {
        Box aBox = new Box(30, 6, 10);
        System.out.println(aBox.getW());
        if (aBox.getW() > 100) {
            System.out.println("กล่องขนาดใหญ่เป็นพิเศษ");
        } else {
            System.out.println("กล่องขนาดปกติ");
        }
        System.out.println(aBox.volume());
        System.out.println(aBox.surface());
    }

    public static void main(String[] args) {
        demo_class_object1();

        }

}