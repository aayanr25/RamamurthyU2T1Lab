public class Student {
    private String name;
    private boolean sport;
    private int gradeNumber;

    public Student (String n, boolean s, int g) {
        name = n;
        sport = s;
        gradeNumber = g;
    }

    public void studentInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student plays sport? " + sport);
        System.out.println("Student grade: " + gradeNumber);
    }
}
