public class StudentRunner {
    public static void main (String[] args) {
        Student student1 = new Student("Roddy", true, 12);
        student1.studentInfo();

        Student student2 = new Student("Stephanie", false, 9);
        student2.studentInfo();
    }
}
