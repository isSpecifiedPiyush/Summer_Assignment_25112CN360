package DAY_2;

import java.util.*;

public class Q6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number of which reverse is to be finded :: ");
        int num = sc.nextInt() , rev = 0;

        while(num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        System.out.print("The reverse of number" + " is :: " + rev);
    }
}
