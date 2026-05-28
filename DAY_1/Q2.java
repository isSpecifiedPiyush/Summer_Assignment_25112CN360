package DAY_1;

import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the valur of number of which table need to be printed :: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.print(i * num + " ");
        }
    }
}
