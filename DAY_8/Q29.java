package DAY_8;

import java.util.*;

public class Q29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows to be printed in half triangle :: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
