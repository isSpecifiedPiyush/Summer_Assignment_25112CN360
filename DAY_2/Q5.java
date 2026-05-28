package DAY_2;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which the sum of Digits is to be finded :: ");
        int num = sc.nextInt() , num_1 , sum = 0;

        num_1 = num;

        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }

            System.out.print("Sum of Digits of number " + num_1 + " is :: " + sum);
    }
}
