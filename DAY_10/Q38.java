package DAY_10;

import java.util.*;

public class Q38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row to Print Inverted triangle :: ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j <= row - i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= row - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
