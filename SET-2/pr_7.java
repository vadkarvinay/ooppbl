import java.util.*;

class Employee {
    private String employeeName;
    private double employeeSalary;

    void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Salary: ");
        employeeSalary = sc.nextDouble();
    }

    void displayEmployeeData() {
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}

public class practical_7 {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
