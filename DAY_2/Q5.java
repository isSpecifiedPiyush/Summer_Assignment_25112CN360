package DAY_2;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which the sum of Digits is to be finded :: ");
        int num = sc.nextInt() , sum = 0;

        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }

            System.out.print("Sum of Digits of number" + " is :: " + sum);
    }
}
