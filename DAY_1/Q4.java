package DAY_1;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Number of which the number of digit is to be find :: " );
        int num = sc.nextInt() , digit = 0 , num_1;

        num_1 = num;

        while(num != 0) {
            num /= 10;
            digit++;
        }

        System.out.print("Number of Digits in " + num_1 + " is :: " + digit);

    }
}
