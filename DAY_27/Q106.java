package DAY_27;
import java.util.*;

class empolyee {
    int id;
    String name;
    double salary;

    empolyee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name +", Salary: " + salary);
    }
}

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<empolyee> empolyees = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===> Employee Management System <===");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1 :
                    System.out.print("Enter Id :: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name :: ");
                    String name = sc.nextLine();

                    System.out.print("Enter salary :: ");
                    double salary = sc.nextDouble();

                    empolyees.add(new empolyee(id, name, salary));

                    System.out.print("Empolyee added");
    
                case 2:
                    if (empolyees.isEmpty()) {
                        System.out.println("No Employees Found!");
                    } else {
                        for (empolyee e : empolyees) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    for (empolyee e : empolyees) {
                        if (e.id == searchId) {
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;
                    for (int i = 0; i < empolyees.size(); i++) {
                        if (empolyees.get(i).id == deleteId) {
                            empolyees.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Employee Deleted!");
                    } else {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

    }
}
