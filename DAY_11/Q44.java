package DAY_11;

import java.util.*;

public class Q44 {

    public static int Factorial(int x) {
        int factorial = 1;

        for(int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print Factorial of number :: ");
        int num = sc.nextInt();

        System.out.print("The factorial of number " + num + " is :: " + Factorial(num));
    }
}
