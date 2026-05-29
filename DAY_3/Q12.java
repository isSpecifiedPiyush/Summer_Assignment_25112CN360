package DAY_3;

import java.util.*;

public class Q12 {

public static int GCD(int x , int y) {

    while(y != 0) {
        int rem = x % y;
        x = y;
        y = rem;
    }
    return x;
}

    public static int LCM(int x , int y) {
        return (x * y) / GCD(x , y);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number_1 :: ");
        int num_1 = sc.nextInt();

        System.out.print("Enter the Number_2 :: ");
        int num_2 = sc.nextInt();

        System.out.print("The LCM of two Number is :: " + LCM(num_1, num_2));
    }
}
