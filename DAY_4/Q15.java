package DAY_4;

import java.util.*;

public class Q15 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be cheaked wheather a Armstrong or not :: ");
        int num = sc.nextInt() , num_1 , arm = 0;

        num_1 = num;

        while(num != 0){
            arm += Math.pow(num % 10 , 3);
            num /= 10;
        }
        if(arm == num_1) {
            System.out.print("The entered number " + num_1 + " is a Armstrong Number");
        } else {
            System.out.print("Not a Armstrong");
        }
    }
}
