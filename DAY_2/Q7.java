package DAY_2;

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number of which Product of Digits if to be finded :: ");
        int num = sc.nextInt() , num_1 , product = 1;

        num_1 = num;

        while(num != 0) {
            product *= num % 10;
            num /= 10;
        }

        System.out.print("The product of Digits of number " + num_1 + " is :: " + product);
    }
}
