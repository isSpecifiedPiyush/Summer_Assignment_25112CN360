package DAY_9;

import java.util.*;

public class Q33 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows to be printed in inverted half triangle :: ");
        int row = sc.nextInt();

        for(int i = row; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
