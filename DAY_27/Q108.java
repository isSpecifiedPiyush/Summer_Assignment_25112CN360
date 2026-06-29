package DAY_27;
import java.util.*;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[5];
    int total;
    double percentage;
    String grade;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
            total += marks[i];
        }

        percentage = total / 5.0;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);

        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("Total      : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
    }
}

public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Marksheet Generation System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    int[] marks = new int[5];

                    System.out.println("Enter Marks of 5 Subjects:");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }

                    students.add(new Student(roll, name, marks));
                    System.out.println("Student Record Added Successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Records Found!");
                    } else {
                        for (Student s : students) {
                            s.display();
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
