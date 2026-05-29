package DAY_4;

import java.util.*;

public class Q13 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Terms in series of Fibonacci :: ");
        int term = sc.nextInt() , a = 0 , b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        for(int i = 1; i < term - 1; i++) {
            int c = 0;
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
