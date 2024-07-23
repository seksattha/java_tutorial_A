//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe", "M");
        Patient p2 = new Patient("TYwin", "LANNISTER", "M", 75.3f, 180f);
        System.out.println(p2);
        System.out.println(p2.getHeight());

        MemberCard m1 = new MemberCard("John", "Snow", "M", "123");
        System.out.println(m1);
        System.out.println(m1.discount(1000f));
        GoldCard m2 = new GoldCard();
        System.out.println(m2.discount(3000));
        MemberCard m3 = new GoldCard();
        System.out.println(m3.discount(5000));

        MemberCard m4 = new PlatinumCard();
        System.out.println(m4.discount(5000));


    }
}