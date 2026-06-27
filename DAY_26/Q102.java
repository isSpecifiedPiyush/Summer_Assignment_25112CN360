package DAY_26;

import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your age :: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.print("Eligible for voting");
        } else {
            System.out.print("Not eligible");
        }
    }
}
