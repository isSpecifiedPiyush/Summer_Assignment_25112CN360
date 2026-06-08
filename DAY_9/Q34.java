package DAY_9;

import java.util.*;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of which numbered triangle is to be printed :: ");
        int num = sc.nextInt();

        for(int i = num; i >= 1; i--) {
            int x = 1;

            for(int j = 0; j < i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
