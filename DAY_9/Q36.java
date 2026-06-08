package DAY_9;

import java.util.*;

public class Q36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in hollow Square :: ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row; j++) {
                if((i == 1 || i == row) || (j == 1 || j == row)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
