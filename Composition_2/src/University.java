import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void displayInfo() {
        System.out.println("University: " + name);
        System.out.println("Enrolled students:");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
