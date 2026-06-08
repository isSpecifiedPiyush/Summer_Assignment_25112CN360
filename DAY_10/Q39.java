package DAY_10;

import java.util.*;

public class Q39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row to print number triangle :: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            int k = 0;
            
            for(int j = num; j > i; j --) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(++k + " ");
            }
            for(int j = 1; j < i; j++) {
                System.out.print(--k  + " ");
            }
            System.out.println();
        }
    }
}
