package DAY_7;

import java.util.*;

public class Q26 {

    public static void Fibonacci(int x , int a , int b , int c) {
        if(x < 3) {
            return;
        }
        System.out.print(c + " ");

        Fibonacci(x - 1, a = b, b = c, c = a + b);
        return;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of which Fibonacci is to be Printed :: ");
        int num = sc.nextInt();

        System.out.print("0 1 ");
        Fibonacci(num, 0, 1, 1);
    }
}
