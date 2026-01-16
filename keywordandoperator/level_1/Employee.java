/*
Sample Program 3: Employee Management System

Static:
- companyName
- displayTotalEmployees()

This:
- Initialize name, id, designation

Final:
- id must be final

Instanceof:
- Validate before printing employee details
*/

class EmployeeDetails {
    static String companyName = "Infosys";
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public EmployeeDetails(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void display(Object obj) {
        if (obj instanceof EmployeeDetails) {
            System.out.println(name + " | " + designation + " | ID: " + id);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails("Varun", 101, "Developer");
        e.display(e);
        EmployeeDetails.displayTotalEmployees();
    }
}
