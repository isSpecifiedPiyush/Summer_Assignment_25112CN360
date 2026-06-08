package DAY_10;

import java.util.*;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of row to Print the triangle :: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = num; j > i; j --) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
