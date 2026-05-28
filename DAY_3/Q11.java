package DAY_3;

import java.util.*;

public class Q11 {

    public static int GCD(int x , int y) {
        int min , ans = 1;
        if(x <= y) {
            min = x;
        } else {
            min = y;
        }
        for(int i = 1; i <= min; i++) {
            if(x % i == 0 && y % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Number_1 :: ");
        int num_1 = sc.nextInt();

        System.out.print("Enter the value of Number_2 :: ");
        int num_2 = sc.nextInt();

        System.out.print("The GCD is :: " + GCD(num_1 , num_2));
    }
}
