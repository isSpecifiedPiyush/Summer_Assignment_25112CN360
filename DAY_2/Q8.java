package DAY_2;

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number of which Palindrome is to be cheaked :: ");
        int num = sc.nextInt() , num_1 , rev = 0;

        num_1 = num;

        while(num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        if(num_1 == rev) {
            System.out.print("The number " + num_1 + " is Palindrome");
        } else {
            System.out.print("Not a Palindrome number");
        }
    }
}
