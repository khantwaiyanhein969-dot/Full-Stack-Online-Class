class Employee {
    private String employeeName;
    private double salary;

    // (i) Default constructor
    public Employee() {
        this.employeeName = "N/A";
        this.salary = 0.0;
    }

    // (ii) Overloaded constructor
    public Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        setSalary(salary); // uses setter rule (min 1500)
    }

    // (iii) Getter for salary
    public double getSalary() {
        return salary;
    }

    // (iii) Setter for salary (minimum basic salary = 1500)
    public void setSalary(double salary) {
        if (salary >= 1500) {
            this.salary = salary;
        } else {
            this.salary = 1500;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Employee object with name "John" and salary 3500.0
        Employee emp = new Employee("John", 3500.0);

        // Change salary to 4000.0 using the setter
        emp.setSalary(4000.0);

        // Display salary using the getter
        System.out.println("Salary: " + emp.getSalary());
    }
}