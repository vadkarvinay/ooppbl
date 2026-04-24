class Employee {
    void displayDetails() {
        System.out.println("Employee: General Details");
    }
}

class Manager extends Employee {
    void displayDetails() {
        System.out.println("Manager: Team Size 10");
    }
}

public class practical_15 {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.displayDetails();

        Employee m = new Manager();
        m.displayDetails(); // runtime polymorphism
    }
}
