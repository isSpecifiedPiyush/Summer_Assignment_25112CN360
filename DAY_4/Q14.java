package DAY_4;

import java.util.*;

public class Q14 {

    public static int Fibonacci(int x) {
        int a = 0 , b = 1 , c = 0;

        for(int i = 1; i < x; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Nth term of Fibonacci :: ");
        int term = sc.nextInt();

        System.out.print("The Nth term is :: " + Fibonacci(term));
    }
}
