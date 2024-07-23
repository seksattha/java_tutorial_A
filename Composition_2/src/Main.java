public class Main {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Introduction to Programming", "CS101");
        Course course2 = new Course("Data Structures", "CS102");

        // Create students
        Student student1 = new Student("Alice", 1001);
        Student student2 = new Student("Bob", 1002);

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Create a university and enroll students
        University university = new University("Tech University");
        university.enrollStudent(student1);
        university.enrollStudent(student2);

        // Display information
        university.displayInfo();
    }
}
