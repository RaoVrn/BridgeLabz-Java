/*
Sample Program 5: University Student Management

Static:
- universityName
- displayTotalStudents()

This:
- Initialize name, rollNumber, grade

Final:
- rollNumber should be final

Instanceof:
- Validate before displaying details
*/

class StudentDetails {
    static String universityName = "SRM University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private char grade;

    public StudentDetails(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void display(Object obj) {
        if (obj instanceof StudentDetails) {
            System.out.println(name + " | Roll: " + rollNumber + " | Grade: " + grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class Student {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails("Varun", 23, 'A');
        s.display(s);
        StudentDetails.displayTotalStudents();
    }
}
