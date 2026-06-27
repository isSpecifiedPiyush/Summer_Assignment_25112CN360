package DAY_27;

import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID :: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student name :: ");
        String name = sc.nextLine();

        System.out.print("Enter the student marks :: ");
        int marks = sc.nextInt();

        System.out.println("Student ID :: " + id);
        System.out.println("Name :: " + name);
        System.out.print("Marks :: " + marks);
    }
}
