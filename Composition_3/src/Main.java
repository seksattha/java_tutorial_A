import java.time.LocalDate;
import java.time.Month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        Name en = new Name("Mr", "John", "Smith");
        Name th = new Name("นาย", "จอห์น", "สมิธ");
        p1.setNameEN(en);
        p1.setNameTH(th);
        p1.setDob(LocalDate.of(1995, Month.JULY, 17));

        System.out.println(p1);


    }
}