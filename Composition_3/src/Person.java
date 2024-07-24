import java.time.LocalDate;

public class Person {
    private Name nameEN, nameTH;
    private LocalDate dob;

    public Person(Name nameEN, Name nameTH, LocalDate dob) {
        this.nameEN = nameEN;
        this.nameTH = nameTH;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameEN=" + nameEN +
                ", nameTH=" + nameTH +
                ", dob=" + dob +
                '}';
    }

    public Person() {
    }

    public Name getNameEN() {
        return nameEN;
    }

    public void setNameEN(Name nameEN) {
        this.nameEN = nameEN;
    }

    public Name getNameTH() {
        return nameTH;
    }

    public void setNameTH(Name nameTH) {
        this.nameTH = nameTH;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
