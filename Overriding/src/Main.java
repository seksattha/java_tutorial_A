//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PlatinumCard m1 = new PlatinumCard();
        System.out.println("Platinum " + m1.discount(1000f));
        System.out.println("ได้รับคะแนน" + m1.calcPoint(1000f));

        GoldCard m2 = new GoldCard();
        System.out.println("Gold" + m2.discount(1000f));
        System.out.println("ได้รับคะแนน" + m2.calcPoint(1000f));




    }
}