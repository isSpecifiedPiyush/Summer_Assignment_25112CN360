package DAY_12;

import java.util.*;

public class Q47 {

    public static void Fibonacci(int x) {
        int a = 0, b = 1, c = 0;

        for(int i = 1; i <= x - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which fibonacci is to printed :: ");
        int num = sc.nextInt();

        System.out.print("0 ");
        System.out.print("1 ");

        Fibonacci(num);
    }
}
