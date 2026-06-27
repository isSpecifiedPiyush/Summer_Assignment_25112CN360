package DAY_27;

import java.util.*;

class Employee {
    int id;
    String name;
    double basicSalary;
    double hra;
    double da;
    double totalSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;

        hra = basicSalary * 0.20; // 20% HRA
        da = basicSalary * 0.10;  // 10% DA
        totalSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\nEmployee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();

                    employees.add(new Employee(id, name, basic));
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        for (Employee emp : employees) {
                            emp.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
