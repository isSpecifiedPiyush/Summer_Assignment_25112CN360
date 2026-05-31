package DAY_5;

import java.util.*;

public class Q18 {

    public static int Factorial(int x) {
        int pro = 1;
        for(int i = 1; i <= x; i ++) {
            pro *= i;
        }
        return pro;
    }
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be cheaked wheather Strong or not :: ");
        int num = sc.nextInt(), num_1, sum = 0;

        num_1 = num;

        while(num != 0) {
            sum += Factorial(num % 10);
            num /= 10;
        }

        if(sum == num_1) {
            System.out.print("The number " + num_1 + " is a Strong number");
        } else {
            System.out.print("Not a Strong number");
        }
    }
}
