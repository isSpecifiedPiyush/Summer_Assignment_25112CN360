package DAY_1;

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number of which factorial is to be finded :: ");
        int num = sc.nextInt() , fact = 1;

        for(int i = 1; i <= num; i ++) {
            fact *= i;
        }

        System.out.print("Factorial of " + num +" is :: " + fact);
    }
}
