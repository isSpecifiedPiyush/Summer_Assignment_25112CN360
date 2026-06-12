package DAY_12;

import java.util.*;

public class Q46 {

    public static int Armstrong(int x) {
        int arm = 0;
        while(x != 0) {
            arm += Math.pow(x % 10 , 3);
            x /= 10;
        }
        return arm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be cheaked wheather Armstrong :: ");
        int num = sc.nextInt();

        if(Armstrong(num) == num) {
            System.out.print("The number is Armstrong");
        } else {
            System.out.print("The number is not a Armstrong");
        }
    }
}
