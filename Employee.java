
public class Employee {
    private String employeeName;
    private int salary;
    private String position;

    // Constructor
    public Employee(String employeeName, int salary, String position) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.position = position;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Main method
    public static void main(String[] args) {
        // Create three objects of Employee class with given values
        Employee employee1 = new Employee("John Due", 1000, "Junior Programmer");
        Employee employee2 = new Employee("Emily Tack", 14000, "Full Stack Developer");
        Employee employee3 = new Employee("Peter John", 4000, "Project Manager");

        // Display employee information
        System.out.println("Employee 1:");
        System.out.println("Name: " + employee1.getEmployeeName());
        System.out.println("Salary: $" + employee1.getSalary());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println();

        System.out.println("Employee 2:");
        System.out.println("Name: " + employee2.getEmployeeName());
        System.out.println("Salary: $" + employee2.getSalary());
        System.out.println("Position: " + employee2.getPosition());
        System.out.println();

        System.out.println("Employee 3:");
        System.out.println("Name: " + employee3.getEmployeeName());
        System.out.println("Salary: $" + employee3.getSalary());
        System.out.println("Position: " + employee3.getPosition());
    }
}
