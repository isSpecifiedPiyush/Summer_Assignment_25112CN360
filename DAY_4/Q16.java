package DAY_4;

import java.util.*;

public class Q16 {

    public static boolean IsArmstrong(int x) {
        int num_1 = x;
        double arm = 0;

        while(x != 0) {
            arm += Math.pow(x % 10 , 3);
            x /= 10;
        }

        if(arm == num_1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Range of Number in which Armstrong property is to be cheaked :: ");
        int range = sc.nextInt();

        for(int i = 1; i <= range; i++) {
            if(IsArmstrong(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}
